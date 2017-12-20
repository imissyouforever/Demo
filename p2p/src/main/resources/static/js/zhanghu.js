// JavaScript Document

$(document).ready(function(e) {
	/*iframe框架*/
   /*$(".wrap_left dl dd li").mouseover(function(){
    $(this).addClass("hover").siblings().removeClass("hover");
    return false;	
       })*/
	/*tab切换*/
    $(".chongz_tab_nav li").click(function(){
		var abc=$(this).index();
		$(this).addClass("hover").siblings().removeClass("hover");
		$(".chong_win .chong_win_con1").eq(abc).show().siblings().hide();
	})
	
});
