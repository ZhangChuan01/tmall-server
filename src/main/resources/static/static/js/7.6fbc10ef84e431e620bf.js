webpackJsonp([7],{"7b5w":function(t,s,i){"use strict";var e={render:function(){var t=this,s=t.$createElement,i=t._self._c||s;return i("div",{attrs:{id:"GoodsDetail"}},[i("header1"),t._v(" "),i("transition",{attrs:{name:"fade"}},[t.scrollTop<-70?i("div",{staticClass:"header2"},[i("div",{staticClass:"back",on:{click:t.back}},[i("i",{staticClass:"iconfont icon-xiangzuo"})]),t._v(" "),i("div",{staticClass:"tab"},t._l(t.tabList,function(s,e){return i("div",{class:{actived:t.activedFlag==e},on:{click:function(s){t.scrollto(e)}}},[t._v(t._s(s))])})),t._v(" "),i("div",{staticClass:"cart"},[i("i",{staticClass:"iconfont icon-gouwuche",on:{click:t.tocart}})])]):t._e()]),t._v(" "),i("div",{ref:"GoodsDetail",staticClass:"goodsWrapper"},[i("div",{staticClass:"goods"},[i("div",{ref:"goodsInfo",staticClass:"goodsInfo"},[i("img",{directives:[{name:"lazy",rawName:"v-lazy",value:t.bgurl,expression:"bgurl"}],staticClass:"bg"}),t._v(" "),i("div",{staticClass:"text"},[i("div",{staticClass:"name"},[t._v(t._s(t.goodsInfo.name))]),t._v(" "),i("div",{staticClass:"realityPrice"},[i("div",[t._v("￥"),i("span",[t._v(t._s(t.goodsInfo.price))])]),t._v(" "),i("div",[t._v("品牌促销")])]),t._v(" "),i("div",{staticClass:"price"},[i("span",[t._v("价格:")]),t._v(" "),i("span",[t._v(t._s(t.goodsInfo.price2))])]),t._v(" "),i("div",{staticClass:"info"},[t._m(0),t._v(" "),i("div",{staticClass:"count"},[i("span",[t._v("月销量:")]),t._v(" "),i("span",[t._v(t._s(t.goodsInfo.sales)+"件")])]),t._v(" "),i("div",{staticClass:"place"},[t._v(t._s(t.goodsInfo.place))])])])]),t._v(" "),i("div",{staticClass:"voucherWrapper",on:{click:t.showVoucherModel}},[t._m(1),t._v(" "),i("div",{staticClass:"right"},[t._v("领取")])]),t._v(" "),i("div",{staticClass:"select",on:{click:t.showSelectModel}},[i("div",{staticClass:"left"},[t._v("请选择产品参数")]),t._v(" "),i("div",{staticClass:"right"},[t._v("...")])]),t._v(" "),i("div",{ref:"evaluate",staticClass:"evaluate"},[i("div",{staticClass:"title"},[t._v("商品评价(556248)")]),t._v(" "),t._l(t.evaluate,function(s){return i("div",{staticClass:"evaluateDetail",class:{badEvaluate:s.rating<4}},[t._v(t._s(s.text))])}),t._v(" "),i("img",{attrs:{src:"/static/image/goodsDetail/p.jpg",alt:""}}),t._v(" "),i("div",{staticClass:"text"},[t._v("我是我们村第一个在淘宝上买东西的人。这里大部分人是不网 购的。他们买东西价格一般不超过五块，听说我在淘宝买东西 后，整个村都震惊了，村长跑到我家里对我爸说我是不是疯了， 老公跟我闹离婚，说这日子没法过了。面对重重压力，我坚持 要买。我相信我这个月的工资不会白花，终于快递我怀揣着激 动的心情，颤抖的打开包裹，那到了，一霎那，感觉我的眼都 要亮瞎了，啊这颜值这手感，只怪我读书少，这质量无法 用华丽的语整个言来形容它。我举着它，骄傲的站在村口，村 都沸腾了，更有人喊，我不给他们看，他们就跳井。吓得我 赶紧收起宝贝，挤出人群落荒而逃。为测试宝贝效果，我立刻 去我们村高达100米山上村长家客厅里用。用完后，在全村人 羡慕的目光中，仰首挺胸扬长而去。")]),t._v(" "),i("div",{staticClass:"time"},[t._v("2018-05-26")]),t._v(" "),t._m(2)],2),t._v(" "),i("div",{ref:"detail",staticClass:"detail"},[t._m(3),t._v(" "),t._m(4),t._v(" "),t._m(5)])])]),t._v(" "),i("div",{staticClass:"footer"},[t._m(6),t._v(" "),i("div",{staticClass:"right"},[i("div",{staticClass:"addCart",on:{click:function(s){t.showSelectModel("add")}}},[t._v("加入购物车")]),t._v(" "),i("div",{staticClass:"buy",on:{click:function(s){t.showSelectModel("buy")}}},[t._v("立即购买")])])]),t._v(" "),i("mt-popup",{attrs:{position:"bottom"},model:{value:t.voucherModel,callback:function(s){t.voucherModel=s},expression:"voucherModel"}},[i("div",{ref:"voucherModel",staticClass:"voucherModel"},[i("div",[i("div",{staticClass:"tmall"},[i("div",{staticClass:"title"},[t._v("天猫购物券")]),t._v(" "),i("div",{staticClass:"info"},[i("div",{staticClass:"left"},[i("div",[t._v("天猫购物券")]),t._v(" "),i("div",[t._v("100%刮中奖 最高50元")]),t._v(" "),i("div",[t._v("有效期：7天")])]),t._v(" "),i("div",{staticClass:"lineWrapper"},[i("div",{staticClass:"line"})]),t._v(" "),i("div",{staticClass:"right"},[i("div",[t._v("200积分")]),t._v(" "),i("div",[t._v("兑换")]),t._v(" "),i("div",[t._v("兑换机会：8次")])])]),t._v(" "),i("div",{staticClass:"tip"},[t._v("全天猫实物商品通用")])]),t._v(" "),i("div",{staticClass:"shop"},[i("div",{staticClass:"title"},[t._v("店铺优惠券")]),t._v(" "),t._l(t.shop,function(s){return i("div",{staticClass:"info"},[i("div",{staticClass:"left"},[i("div",[i("span",[t._v("￥")]),t._v(t._s(s.price))]),t._v(" "),i("div",[t._v("满"+t._s(s.totalPrice)+"使用")]),t._v(" "),i("div",[t._v("有效期 2018.05.15-2018.08.31")])]),t._v(" "),i("div",{staticClass:"lineWrapper"},[i("div",{staticClass:"line"})]),t._v(" "),i("div",{staticClass:"right"},[i("div",[t._v("立即领取")])])])})],2)])])]),t._v(" "),i("mt-popup",{attrs:{position:"bottom"},model:{value:t.selectModel,callback:function(s){t.selectModel=s},expression:"selectModel"}},[i("div",{staticClass:"selectModel"},[i("div",{staticClass:"content"},[i("div",{staticClass:"header"},[i("div",{staticClass:"imgContainer"},t._l(t.imgList,function(s,e){return i("img",{directives:[{name:"show",rawName:"v-show",value:t.smallImg(e),expression:"smallImg(index)"}],attrs:{src:s,alt:""}})})),t._v(" "),i("div",{staticClass:"selectInfo"},[i("div",{staticClass:"price"},[t._v("￥"+t._s(t.price))]),t._v(" "),i("div",{directives:[{name:"show",rawName:"v-show",value:t.flag1,expression:"flag1"}],staticClass:"stock"},[t._v("库存 "+t._s(t.stock))]),t._v(" "),i("div",{directives:[{name:"show",rawName:"v-show",value:!t.flag1,expression:"!flag1"}],staticClass:"stock"},[t._v("有货")]),t._v(" "),i("div",{staticClass:"stock"},[t._v(t._s(t.selectInfo))])]),t._v(" "),i("div",{staticClass:"close",on:{click:function(s){t.selectModel=!t.selectModel}}},[t._v("×")])]),t._v(" "),i("div",{ref:"scrollWrapper",staticClass:"scrollWrapper",staticStyle:{overflow:"hidden"}},[i("div",{staticClass:"selectScroll"},[t._l(t.list,function(s,e){return i("div",{staticClass:"goodsInfos"},[i("div",[t._v(t._s(s.title))]),t._v(" "),i("div",{staticClass:"list"},t._l(s.val,function(s,a){return i("span",{staticClass:"btn",class:[{checked:a==t.flagList[e].index},{nostock:t.noStockFlag[e][a]}],on:{click:function(i){t.select(e,a,s,t.noStockFlag[e][a])}}},[t._v(t._s(s))])}))])}),t._v(" "),i("div",{staticClass:"count"},[i("span",[t._v("购买数量")]),t._v(" "),i("div",{staticClass:"changeNum"},[i("i",{staticClass:"iconfont icon-jianhao",class:{numActive:t.num>1},on:{click:t.sub}}),t._v(" "),i("input",{directives:[{name:"model",rawName:"v-model",value:t.num,expression:"num"}],attrs:{type:"text"},domProps:{value:t.num},on:{input:function(s){s.target.composing||(t.num=s.target.value)}}}),t._v(" "),i("i",{staticClass:"iconfont icon-jiahao",class:{numActive:t.addCheck},on:{click:t.add}})])])],2)])]),t._v(" "),i("div",{staticClass:"btnGroup"},[i("div",{staticClass:"add",on:{click:function(s){t.addCart("add")}}},[t._v("加入购物车")]),t._v(" "),i("div",{staticClass:"buy",on:{click:function(s){t.addCart("buy")}}},[t._v("立即购买")])])])])],1)},staticRenderFns:[function(){var t=this.$createElement,s=this._self._c||t;return s("div",{staticClass:"express"},[s("span",[this._v("快递:")]),this._v(" "),s("span",[this._v("0.00")])])},function(){var t=this.$createElement,s=this._self._c||t;return s("div",{staticClass:"left"},[s("div",{staticClass:"voucher"},[s("img",{attrs:{src:"/static/image/goodsDetail/quan1.png",alt:""}}),this._v(" "),s("span",[this._v("全天猫实物商品通用")])]),this._v(" "),s("div",{staticClass:"voucher"},[s("img",{attrs:{src:"/static/image/goodsDetail/quan2.png",alt:""}}),this._v(" "),s("span",[this._v("领取优惠券")])])])},function(){var t=this.$createElement,s=this._self._c||t;return s("div",{staticClass:"moreEvaluate"},[s("span",[this._v("查看更多评价")])])},function(){var t=this.$createElement,s=this._self._c||t;return s("div",{staticClass:"title"},[s("div",{staticClass:"line"}),this._v(" "),s("div",[this._v("详情")]),this._v(" "),s("div",{staticClass:"line"})])},function(){var t=this.$createElement,s=this._self._c||t;return s("div",{staticClass:"showImg"},[s("span",[this._v("商品图片")])])},function(){var t=this.$createElement,s=this._self._c||t;return s("div",{staticClass:"imgContainer"},[s("img",{attrs:{src:"/static/image/goodsDetail/good1detail1.png",alt:""}}),this._v(" "),s("img",{attrs:{src:"/static/image/goodsDetail/good1detail2.png",alt:""}}),this._v(" "),s("img",{attrs:{src:"/static/image/goodsDetail/good1detail3.png",alt:""}})])},function(){var t=this,s=t.$createElement,i=t._self._c||s;return i("div",{staticClass:"left"},[i("div",{staticClass:"store"},[i("i",{staticClass:"iconfont icon-dianpu"}),t._v(" "),i("div",[t._v("店铺")])]),t._v(" "),i("div",{staticClass:"people"},[i("i",{staticClass:"iconfont icon-kefu",staticStyle:{color:"#3a8ee6"}}),t._v(" "),i("div",[t._v("客服")])]),t._v(" "),i("div",{staticClass:"collection"},[i("i",{staticClass:"iconfont icon-favorite_diss"}),t._v(" "),i("div",[t._v("收藏")])])])}]};s.a=e},"G4I+":function(t,s,i){"use strict";Object.defineProperty(s,"__esModule",{value:!0});var e=c(i("qdB1")),a=(i("wSez"),c(i("uAC3"))),o=c(i("4uQT"));function c(t){return t&&t.__esModule?t:{default:t}}s.default={name:"GoodsDetail",data:function(){return{goodsData:[],voucherModel:!1,selectModel:!1,type:"png",num:1,scrollTop:0,goodsInfo:{},bgurl:"",shop:[{price:10,totalPrice:199},{price:10,totalPrice:199},{price:20,totalPrice:399},{price:50,totalPrice:599}],goodId:1,addCheck:!0,tabList:["商品","评价","详情"],activedFlag:0,flagList:[],flag1:!1,noStockFlag:[],noStock:[],noStockList:[],stock:0,list:[],price:0,imgList:[],evaluate:[{text:"便宜(19733)",rating:4},{text:"快递不错(14300)",rating:5},{text:"质量很好(9253)",rating:5},{text:"味道不错(8070)",rating:4},{text:"人群(4728)",rating:4},{text:"质量一般(1070)",rating:3}],clickFlag:!0}},computed:{selectInfo:function(){var t=this,s="";if(0!=this.flagList.length)return this.flagList.every(function(t){return-1!=t.index})?(s="已选择: ",this.flagList.forEach(function(t){s+=t.content+" "}),this.flag1=!0,this.stock>0&&this.num>=this.stock?(this.num=this.stock,this.addCheck=!1):this.addCheck=!0):(s="请选择: ",this.flagList.forEach(function(i,e){-1==i.index&&(s+=t.list[e].title)})),s}},watch:{num:function(t){this.num=parseInt(t),t<1&&(this.$toast({message:"真的不能再少了",duration:2e3}),this.num=1),"number"==typeof this.stock&&this.stock>0&&(this.num>=this.stock?(this.num=this.stock,this.addCheck=!1):this.addCheck=!0)}},methods:{addCart:function(t){var s=this,i=a.default.get("userId");if(i){if(this.selectInfo.indexOf("已选择: ")<0)return void this.$toast({message:this.selectInfo,duration:2e3});var e=this.selectInfo.substring(5).replace(/\s+/g,",");e=e.substring(0,e.length-1);var o=this.goodId,c=this.num;this.clickFlag&&(this.clickFlag=!1,this.$axios.post("/cart/addCart",{userId:i,gInfo:e,gId:o,gNumber:c}).then(function(i){1==i.data.code?(s.$toast({message:"加入购物车成功",duration:1e3}),"add"===t?setTimeout(function(){s.clickFlag=!0},1e3):s.tocart()):s.$toast({message:"加入购物车失败",duration:1e3})}))}else this.$router.push({path:"/login"})},back:function(){this.$router.go(-1)},tocart:function(){this.$router.push({name:"cart"})},scrollto:function(t){0==t?this.GoodsDetailScroll.scrollToElement(this.$refs.goodsInfo,1e3,0,-50):1==t?this.GoodsDetailScroll.scrollToElement(this.$refs.evaluate,1e3,0,-50):this.GoodsDetailScroll.scrollToElement(this.$refs.detail,1e3,0,-50)},firstNoSrock:function(){var t=this,s=this.list.length;0!=s&&(this.noStockList.length<1||(1==s?this.list[0].val.forEach(function(s,i){t.noStockList.forEach(function(e){e.indexOf(s)>-1&&(t.noStockFlag[0][i]=!0)})}):this.list.forEach(function(s,i){s.val.forEach(function(s,e){t.list.forEach(function(a,o){if(i!=o){var c=0;a.val.forEach(function(i){t.noStockList.forEach(function(t){t.indexOf(i)>-1&&t.indexOf(s)>-1&&c++})}),c==a.val.length&&(t.noStockFlag[i][e]=!0)}})})})))},nostock:function(t,s){var i=this;this.list.forEach(function(e,a){a!=t&&e.val.forEach(function(t,e){i.noStockFlag[a][e]=!1,i.noStock.forEach(function(o){o.indexOf(t)>-1&&o.indexOf(s)>-1&&(i.noStockFlag[a][e]=!0)})})})},select:function(t,s,i,e){if(!e){this.flagList[t].index=s,this.flagList[t].content=i;var a=[];this.noStockList.forEach(function(t){t.indexOf(i)>-1&&a.push(t)}),this.noStock=a,this.nostock(t,i),this.getStock()}},smallImg:function(t){return 1==this.imgList.length||(-1==this.flagList[0].index?0==t:t==this.flagList[0].index)},init:function(){var t=this;this.goodId=this.$route.params.id,this.type=this.$store.state.imgType,this.$axios.get("/goods/detail",{params:{goodId:this.goodId}}).then(function(s){var i=s.data;1==i.code?(t.goodsInfo=i.res,t.bgurl="./static"+t.goodsInfo.url+t.type,t.price=t.goodsInfo.price):t.$toast({message:"请求数据出错",duration:2e3})})},add:function(){"Number"!=typeof this.stock?this.num++:this.num<this.stock&&this.num++},sub:function(){this.num>1&&this.num--},getStock:function(){var t=this,s=this.selectInfo.split(" ").toString();this.goodsData.forEach(function(i,e){if(s.indexOf(i.info)>-1)return t.stock=i.stock,void(t.price=i.price)})},showVoucherModel:function(){var t=this;this.voucherModel=!this.voucherModel,this.$nextTick(function(){t.modelScroll?t.modelScroll.scrollTo(0,0):t.modelScroll=new e.default(t.$refs.voucherModel,{click:!0,probeType:3})})},showSelectModel:function(t){var s=this;this.selectInfo.indexOf("请选择")>=0?(this.selectModel=!this.selectModel,this.getStock(),this.$nextTick(function(){s.scrollWrapperScroll?s.scrollWrapperScroll.scrollTo(0,0):s.scrollWrapperScroll=new e.default(s.$refs.scrollWrapper,{click:!0,probeType:3})})):this.addCart(t)},getGoods:function(){var t=this;this.$axios.get("/goods/detail/selectInfo",{params:{gId:this.goodId}}).then(function(s){var i=s.data;1==i.code&&(t.goodsData=i.res,i.res[0].kind.split(",").forEach(function(s,i){var e={};e.title=s,e.val=[],t.$set(t.list,i,e)}),i.res.forEach(function(s){if(0==s.stock&&t.noStockList.push(s.info),s.info.split(",").forEach(function(s,i){t.list[i].val.indexOf(s)<0&&t.list[i].val.push(s)}),t.imgList.indexOf(s.path)<0){var i=t.imgList.length;t.$set(t.imgList,i,s.path)}}),t.list.forEach(function(s){var i=t.flagList.length;t.$set(t.flagList,i,{index:-1,content:""})}),t.list.forEach(function(s,i){t.noStockFlag.length;t.$set(t.noStockFlag,i,[]),s.val.forEach(function(){t.noStockFlag[i].push(!1)})}))})},quickSort:function(t,s,i){if(!(t.length<=0||s>=i)){for(var e=s,a=i,o=t[e];e<a;){for(;e<a&&t[a]>=o;)a--;for(t[e]=t[a];e<a&&t[e]<=o;)e++;t[a]=t[e]}t[e]=o,this.quickSort(t,s,e-1),this.quickSort(t,e+1,i)}},myQuickSort:function(t){if(t.length<=1)return t;for(var s=Math.floor(t.length/2),i=t.splice(s,1)[0],e=[],a=[],o=0;o<t.length;o++)t[o]<i?e.push(t[o]):a.push(t[o]);return this.myQuickSort(e).concat([i],this.myQuickSort(a))},binarySearch:function(t,s){for(var i=void 0,e=0,a=t.length;e<=a;)if(s<t[i=Math.floor((e+a)/2)])a=i-1;else{if(!(s>t[i]))return i;e=i+1}}},mounted:function(){var t=this;this.$nextTick(function(){var t=document.body.clientHeight||document.documentElement.clientHeight,s=document.querySelector(".voucherModel"),i=document.querySelector(".selectModel"),e=document.querySelector(".scrollWrapper");s.style.height=.6*t+"px",i.style.height=.7*t+"px",e.style.height=.7*t*.66+"px"}),this.GoodsDetailScroll?this.GoodsDetailScroll.refresh():(this.GoodsDetailScroll=new e.default(this.$refs.GoodsDetail,{click:!0,probeType:3}),this.GoodsDetailScroll.on("scroll",function(s){t.scrollTop=s.y,s.y<-500&&s.y>-750?t.activedFlag=1:s.y>-501?t.activedFlag=0:t.activedFlag=2}))},updated:function(){this.firstNoSrock()},created:function(){this.init(),this.getGoods()},components:{header1:o.default}}},"mwl+":function(t,s){},pkMe:function(t,s,i){"use strict";Object.defineProperty(s,"__esModule",{value:!0});var e=i("G4I+"),a=i.n(e);for(var o in e)"default"!==o&&function(t){i.d(s,t,function(){return e[t]})}(o);var c=i("7b5w");var l=function(t){i("mwl+")},n=i("vSla")(a.a,c.a,!1,l,null,null);s.default=n.exports}});
//# sourceMappingURL=7.6fbc10ef84e431e620bf.js.map