webpackJsonp([0],{"/htb":function(t,e){},ArYE:function(t,e){},JSSm:function(t,e){},MHXi:function(t,e){},NHnr:function(t,e,s){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var i=s("7+uW"),n=(s("feh2"),{name:"App",data:function(){return{headerFlag:!0}},methods:{back:function(){history.back()},judgmentBrowser:function(){"micromessenger"==navigator.userAgent.toLowerCase().match(/MicroMessenger/i)?this.headerFlag=!1:this.$refs.pageContent.style.top="10.667vw"}},mounted:function(){this.judgmentBrowser()}}),r={render:function(){var t=this.$createElement,e=this._self._c||t;return e("div",{attrs:{id:"app"}},[this.headerFlag?e("div",{staticClass:"header",attrs:{id:"myheader"}},[e("i",{staticClass:"iconfont icon-fanhui",on:{click:this.back}}),this._v(" "),e("span",[this._v("送您实惠又专业的健康体检")])]):this._e(),this._v(" "),e("div",{ref:"pageContent",staticClass:"pageContent"},[e("router-view")],1)])},staticRenderFns:[]};var a=s("VU/8")(n,r,!1,function(t){s("/htb")},null,null).exports,c=s("/ocq"),l=s("GQaK"),o=s("Au9i"),u=s.n(o),v={name:"HelloWorld",data:function(){return{number:"",src:"./static/image/voucher.png"}},methods:{reciveVoucher:function(){if(this.number){return!!/(^1[0-9]{10}$)/.test(this.number)||(this.$toast({message:"请输入正确手机号",duration:1e3}),!1)}return this.$toast({message:"请输入手机号",duration:1e3}),!1},reset:function(){this.number=""},go:function(){var t=this;this.reciveVoucher()&&(o.Indicator.open({text:"领取中",spinnerType:"fading-circle"}),setTimeout(function(){o.Indicator.close(),t.$store.commit("setFromIndex","true"),t.$router.push({name:"recive"})},2e3))},initScroll:function(){var t=this;this.$nextTick(function(){t.cartScroll?t.cartScroll.scrollTo(0,0):t.cartScroll=new l.a(t.$refs.share,{click:!0,probeType:3})})}},mounted:function(){var t=this;this.initScroll(),window.onresize=function(){t.cartScroll.refresh();var e=t.$refs.telNumber.offsetHeight;t.cartScroll.scrollToElement(t.$refs.telNumber,500,0,-e)}}},h={render:function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("div",{attrs:{id:"share"}},[s("div",{ref:"share",staticClass:"scrollWrapper"},[s("div",{ref:"textContent",staticClass:"textContent"},[s("div",{staticClass:"index"},[s("img",{directives:[{name:"lazy",rawName:"v-lazy",value:t.src,expression:"src"}],attrs:{alt:""}}),t._v(" "),s("div",{staticClass:"content"},[s("div",{staticClass:"wrapper"},[s("giveVoucher"),t._v(" "),s("div",[t._m(0),t._v(" "),s("div",{ref:"telNumber",staticClass:"telNumber"},[s("input",{directives:[{name:"model",rawName:"v-model",value:t.number,expression:"number"}],attrs:{type:"number",placeholder:"请输入手机号"},domProps:{value:t.number},on:{input:function(e){e.target.composing||(t.number=e.target.value)}}}),t._v(" "),s("i",{staticClass:"iconfont icon-cuowu",on:{click:t.reset}})])])],1)]),t._v(" "),s("a",{staticClass:"download",attrs:{href:"https://tklife.mobile.taikang.com/app-t"}},[t._v("下载泰生活APP")])])])]),t._v(" "),s("div",{staticClass:"btn",on:{click:t.go}},[t._v("领取优惠券")])])},staticRenderFns:[function(){var t=this.$createElement,e=this._self._c||t;return e("div",{staticClass:"reciveWrapper"},[e("div",{staticClass:"line1"}),this._v(" "),e("span",{staticClass:"text"},[this._v("快来领取吧")]),this._v(" "),e("div",{staticClass:"line2"})])}]};var d=s("VU/8")(v,h,!1,function(t){s("MHXi")},null,null).exports,f={name:"recive",methods:{share:function(){this.$router.push({name:"share"})},init:function(){"false"==this.$store.state.fromIndex?this.$router.replace({name:"share"}):this.initScroll()},initScroll:function(){var t=this;this.$nextTick(function(){t.reviceScroll?t.reviceScroll.refresh():t.reviceScroll=new l.a(t.$refs.scrollWrapper,{click:!0,probeType:3})})}},mounted:function(){this.init()}},m={render:function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("div",{staticClass:"recive"},[s("div",{ref:"scrollWrapper",staticClass:"scrollWrapper"},[s("div",{staticClass:"contentWrapper"},[s("div",{staticClass:"content"},[t._m(0),t._v(" "),s("div",{staticClass:"main"},[s("div",{staticClass:"title"},[t._v("燕园体检优惠券")]),t._v(" "),s("div",{staticClass:"name"},[t._v("500元体检优惠券")]),t._v(" "),s("div",{staticClass:"time"},[t._v("2018-04-11至2018-08-31")]),t._v(" "),s("div",{staticClass:"line"}),t._v(" "),s("div",{staticClass:"textWrapper"},[t._m(1),t._v(" "),s("div",{staticClass:"text"},[t._v("以该手机号登录泰生活APP使用")]),t._v(" "),s("div",{staticClass:"border"}),t._v(" "),s("rule")],1)])])]),t._v(" "),s("div",{staticClass:"btn",on:{click:t.share}},[t._v("去泰生活APP享用优惠")])])])},staticRenderFns:[function(){var t=this.$createElement,e=this._self._c||t;return e("div",{staticClass:"logoWrapper"},[e("div",{staticClass:"logo"})])},function(){var t=this.$createElement,e=this._self._c||t;return e("div",{staticClass:"user"},[this._v("已发放至账户 "),e("span",[this._v("186010002000")])])}]};var p=s("VU/8")(f,m,!1,function(t){s("ArYE")},null,null).exports,_={name:"share",data:function(){return{src:"./static/image/voucher.png"}},methods:{index:function(){this.$router.push({name:"home"})},initScroll:function(){var t=this;this.$nextTick(function(){t.shareScroll?t.shareScroll.refresh():t.shareScroll=new l.a(t.$refs.scrollWrapper,{click:!0,probeType:3})})}},mounted:function(){this.initScroll()}},C={render:function(){var t=this.$createElement,e=this._self._c||t;return e("div",{staticClass:"share"},[e("div",{ref:"scrollWrapper",staticClass:"scrollWrapper"},[e("div",{staticClass:"contentWrapper"},[e("div",{staticClass:"content"},[e("img",{directives:[{name:"lazy",rawName:"v-lazy",value:this.src,expression:"src"}],attrs:{alt:""}}),this._v(" "),e("div",{staticClass:"textContent"},[e("giveVoucher"),this._v(" "),e("div",{staticClass:"ruleWrapper"},[e("rule")],1)],1)])])]),this._v(" "),e("div",{staticClass:"btn",on:{click:this.index}},[this._v("去泰生活APP抢券")])])},staticRenderFns:[]};var g=s("VU/8")(_,C,!1,function(t){s("nTh3")},null,null).exports;i.default.use(c.a);var b=new c.a({routes:[{path:"/",name:"home",component:d},{path:"/recive",name:"recive",component:p},{path:"/share",name:"share",component:g}]}),x=(s("d8/S"),s("JSSm"),{render:function(){this.$createElement;this._self._c;return this._m(0)},staticRenderFns:[function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("div",{staticClass:"rule"},[s("ul",[s("li",[t._v("活动规则")]),t._v(" "),s("li",[t._v("1.每人1次只能领取1张优惠券，不可多次领取；")]),t._v(" "),s("li",[t._v("2.本优惠券只适用于泰生活APP购买体检服务；")]),t._v(" "),s("li",[t._v("3.本优惠券只能用于购买泰康燕园康复医院体检中心白金-常规体检套餐；")]),t._v(" "),s("li",[t._v("4.有效期间：2018年4月11日至2018年8月31日。")])])])}]});var $=s("VU/8")({name:"rule"},x,!1,function(t){s("zfR1")},null,null).exports,S={render:function(){this.$createElement;this._self._c;return this._m(0)},staticRenderFns:[function(){var t=this.$createElement,e=this._self._c||t;return e("div",{staticClass:"giveVoucher"},[e("div",{staticClass:"text1"},[this._v("送您一张体检优惠券，可优惠500元")]),this._v(" "),e("div",{staticClass:"text2"},[this._v("适用于燕园康复医院体检中心，白金-常规套餐体检")]),this._v(" "),e("div",{staticClass:"line"})])}]};var w=s("VU/8")({name:"giveVoucher"},S,!1,function(t){s("z1bB")},null,null).exports,k=s("NYxO");i.default.use(k.a);var W=new k.a.Store({state:{fromIndex:"false"},mutations:{setFromIndex:function(t,e){t.fromIndex=e}}});i.default.component(o.Spinner.name,o.Spinner),i.default.component("rule",$),i.default.component("giveVoucher",w),i.default.use(o.Lazyload),i.default.use(u.a),i.default.config.productionTip=!1,new i.default({el:"#app",router:b,store:W,components:{App:a},template:"<App/>"})},"d8/S":function(t,e){},feh2:function(t,e){},nTh3:function(t,e){},z1bB:function(t,e){},zfR1:function(t,e){}},["NHnr"]);
//# sourceMappingURL=app.fd159af0c684e1003c5a.js.map