<template>
    <el-scrollbar style="width: 1200px;margin: 0 auto;" wrap-class="no-horizontal" class="page-card">
        <div class="header-title">
            <span>商品详情</span>
            <span class="right-btn ml-3" @click="$router.back();"><i class="el-icon-arrow-left"></i>返回上一页</span>
            <span class="right-btn" @click="$router.back();">回到首页</span>
        </div>
        <div class="main" v-loading="loading">
            <div class="left">
                <div class="info">
                    <div class="pic-info">
                        <preview-image :src="currentPic" class-name="current-pic" width="410px" height="410px"/>
                        <el-scrollbar class="pic-list flex-shrink-0" view-class="no-wrap d-flex w-auto" >
                            <img class="pic" v-for="(src, index) in picList" :src="src" :key="index" @click="changeCurrentPic(index)"/>
                        </el-scrollbar>
                    </div>
                    <div class="describe-info">
                        <div class="product-name">{{productInfo.name }}</div>
                        <div class="price-info">
                            <div class="profit">利润率：
                                <span class="number">{{productInfo.minProfitRatio}}%</span>
                                <span v-show="productInfo.minProfitRatio==productInfo.maxProfitRatio?false:true" class="number">- {{productInfo.maxProfitRatio}}%</span>
                            </div>
                            <div class="suggest-price">建议零售价：
                                <span class="number">￥{{productInfo.minSellPrice}}</span>
                                <span v-show="productInfo.minSellPrice==productInfo.maxSellPrice?false:true" class="number">-￥{{productInfo.maxSellPrice}}</span>
                            </div>
                            <div class="supply-price">供货价：
                                <span class="number">￥{{productInfo.minDistributionPrice}}</span>
                                <span v-show="productInfo.minDistributionPrice==productInfo.maxDistributionPrice?false:true" class="number">-￥{{productInfo.maxDistributionPrice}}</span>
                            </div>
                        </div>
                        <div class="express-fee">运费：{{expressTemplate}}</div>
                        <div class="sell">
                            <span>总销量：<span class="number">{{productInfo.sellCount}}</span>件</span>
                            <span class="ml-3">分销商：{{shopInfo.cooperateCount}}</span>
                        </div>
                        <div class="inventory">总库存：<span class="number">{{productInfo.inventory}}</span></div>

                        <div class="specs-info" v-for="spcsData in gridData">
                            <span>规格:{{specsInfos(spcsData.specsInfo)}}</span>
                            <span>￥{{spcsData.distributionPrice}}</span>
                            <span>{{spcsData.inventory}}件可售</span>
                        </div>

                        <div class="specs-info">
                            <el-popover
                                placement="bottom-end"
                                width="400"
                                v-show="true"
                                trigger="click">
                                <el-table :data="otherSpecsData" width="10px">
                                    <el-table-column width="100" property="specsInfo" label="规格">
                                        <template slot-scope="scope">
                                            {{specsInfos(scope.row.specsInfo)}}
                                        </template>
                                    </el-table-column>
                                    <el-table-column width="100" property="inventory" label="供应价">
                                        <template slot-scope="scope">
                                            ￥{{scope.row.distributionPrice}}
                                        </template>
                                    </el-table-column>
                                    <el-table-column width="100" property="inventory" label="库存"> </el-table-column>
                                </el-table>
                                <span class="show-others" v-show="(otherSpecsData && otherSpecsData.length > 0)?true:false" slot="reference">查看剩余{{otherSpecsData.length}}个规格</span>
                            </el-popover>
                        </div>

                        <div class="btn-add-warehouse active-bg-theme active"  v-show="shopInfo.showCooperation=='0'">添加至仓库</div>
                        <div class="btn-add-warehouse active-bg-theme active" :class="{active:shopInfo.showCooperation=='0'}" v-show="shopInfo.showCooperation=='1'">添加至仓库</div>

                    </div>
                </div>
                <div class="store-info">
                    <div class="left-info">
                        <img class="store-logo" src="https://lanhu.oss-cn-beijing.aliyuncs.com/xd9c91dc69-18e8-463b-93f2-a5d47c6ecc29"/>
                        <div class="name-info">
                            <div class="name">{{shopInfo.name}}</div>
                            <div class="distribution">
                                <span>分销商品：{{shopInfo.goodsCount}}</span>
                                <span class="ml-3">分销商：{{shopInfo.cooperateCount}}</span>
                            </div>
                        </div>
                    </div>
                    <div class="right-buttons">
                        <div class="button-item " :class="{active:shopInfo.cooperation==1}"  v-show="shopInfo.showCooperation==0">添加合作</div>
                        <!--<div class="button-item "   v-show="shopInfo.showCooperation==1">添加合作</div>-->
                        <div class="button-item" >进入店铺</div>
                    </div>
                </div>
                <el-tabs value="first" class="detail-tab">
                    <el-tab-pane label="商品详情" name="first">
                        <img class="w-100 h-auto" v-for="(src, index) in picDetailList" :src="src" :key="index" @click="changeCurrentPic(index)"/>
                    </el-tab-pane>
                    <el-tab-pane label="商品评论" name="second">
                        <div class="comment-top">
                            <div class="comment-header">累计评价563</div>
                            <el-radio-group class="comment-types" v-model="commentType">
                                <el-radio v-for="(item, index) in commentTypes" :label="item.value" :key="index">{{item.label}}</el-radio>
                            </el-radio-group>
                        </div>
                    </el-tab-pane>
                </el-tabs>
            </div>
            <div class="right">
                <div class="recommend">其他商家还在看</div>
                <div class="recommend-product" v-for="otherProduct in recommendProductList">
                    <img class="product-image" :src="api.getImageUrl(otherProduct.picId)"/>
                    <div class="product-name">{{otherProduct.name}}</div>
                    <div class="price">
                        <span>供货价 ￥{{otherProduct.minDistributionPrice}}</span>
                        <span class="profit">利润<span class="number">{{otherProduct.maxProfitRatio}}%</span></span>
                    </div>
                </div>
            </div>
        </div>
    </el-scrollbar>
</template>

<script>
    import PreviewImage from "../../../../components/preview-image/preview-image";

    export default {
        name: "productDetail",
        components: {PreviewImage},
        data() {
            return {
                loading: false,
                showDialog: false,
                detailInfo: {},
                productInfo: {},// 商品信息
                shopInfo: {},// 店铺信息
                productSpecsDetailList: [],
                picList: [],// 商品图片
                picDetailList:[],//商品详情
                recommendProductList:[],
                currentPic: "",
                commentType: 0,
                expressTemplate:"",// 运费模板信息
                commentTypes: [
                    {label: "全部", value: 0},
                    {label: "图片", value: 1},
                    {label: "追评", value: 2},
                    {label: "好评", value: 3},
                    {label: "中评", value: 4},
                    {label: "差评", value: 5},
                ],
                gridData: [],
                otherSpecsData:[]
            };
        },
        created(){
            this.init();
        },
        watch: {
            $route() {
                this.init();
            }
        },
        methods: {
            specsInfos(specsInfo){
                let resultStr = "";
                if(specsInfo){
                    specsInfo.forEach((item)=>{
                        resultStr=resultStr+"/"+item.value;
                    })
                }
                return resultStr.substr(1,resultStr.length);
            },
            init(){
                let {productId} = this.$route.query;
                if (productId) {
                    this.showDialog = true;
                    this.loading = true;
                    this.api.product.distributionProductPDetail(productId).then(res => {
                        // 商品信息
                        this.productInfo = res.data.product;
                        // 快递模板信息
                        if(res.data.product.expressType==0){
                            this.expressTemplate = "￥"+res.data.product.expressFee;
                        }else{
                            this.expressTemplate = res.data.expressTemplate.billType==1?"按重量":"按件数";
                        }
                        // productShopVO 店铺信息
                        this.shopInfo  = res.data.productShopVO;
                        // productSpecsDetailList 规格信息
                        res.data.productSpecsDetailList.forEach((item) => {
                            item.specsInfo = JSON.parse(item.specsInfo);
                        });
                        if(res.data.productSpecsDetailList && res.data.productSpecsDetailList.length > 3){
                            this.gridData = res.data.productSpecsDetailList.slice(0,3);
                            this.otherSpecsData = res.data.productSpecsDetailList.slice(3);
                        }else{
                            this.gridData = res.data.productSpecsDetailList;
                            this.otherSpecsData = [];
                        }

                        // 图片信息
                        this.api.uc.getUploadInfo(this.productInfo.picId).then(res => {
                            this.picList = res.fileList.map(item => {
                                return res.domain + item.filePath;
                            });
                            if(this.picList.length){
                                this.currentPic = this.picList[0];
                            }
                        })
                        // 商品详情信息
                        this.api.uc.getUploadInfo(this.productInfo.detailPicId).then(res => {
                            this.picDetailList = res.fileList.map(item => {
                                return res.domain + item.filePath;
                            });
                        })
                        //  其他推荐商品
                        this.recommendProductList = res.data.recommendProductList;

                    }).catch(res => {
                        this.$message.error(res.msg || "商品信息加载失败");
                        this.showDialog = false;
                    }).finally(() => {
                        this.loading = false;
                    });
                }
            },
            changeCurrentPic(index){
                this.currentPic = this.picList[index];
            }
        }
    }
</script>
<style scoped lang="scss">
    @import "detail";
</style>
<style lang="scss">
    .detail-tab {
        .el-tabs__nav-wrap::after {
            display: none;

        }

        .el-tabs__item{
            font-size: 16px;
            color: #202329;
        }

        .el-tabs__item:hover,
        .el-tabs__item.is-active {
            color: #EA5404;
        }

        .el-tabs__active-bar {
            background-color: #EA5404;
        }
    }
</style>
