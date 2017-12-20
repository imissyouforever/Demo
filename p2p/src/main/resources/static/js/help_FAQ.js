$(document).ready(function(e) {
		  $('.gywm ul .lista').click(function(){
			 $(".list").toggle();
			 
			 }); 
			$('.gywm ul li').click(function(){
				$(this).addClass("hover").siblings().removeClass("hover");
				
				})
			$('.con>dl').click(function(){
				$(this).find("dd").addClass("hover").parents().siblings().children().removeClass("hover");
				
				})
/*�ӵ���*/
 $(window).scroll(function(){
   var sT = $(document).scrollTop();
   if(sT>=131){
     $(".sub_menu").show();
   }else{
     $(".sub_menu").hide();
   }
 })
/*���ض���*/
 $(".back ul .xinxi").hover(function(){
   $(this).addClass("hover");
   $(".back ul .xinxi p").addClass("hover");
   $(".back ul .xinxi span").show();
 },function(){
   $(this).removeClass("hover");
   $(".back ul .xinxi p").removeClass("hover");
   $(".back ul .xinxi span").hide();
 })
 
 $(window).scroll(function(){
   var wh = $(window).height();
   var st = $(document).scrollTop();
   
   if(st<=wh){
     $(".back ul .back_btn").slideUp();
   }else{
     $(".back ul .back_btn").slideDown();
   }
   
 })
 
 $(".back ul .back_btn").hover(function(){
   $(this).addClass("hover");
 },function(){
   $(this).removeClass("hover");
 })
 
 $(".back ul .back_btn").click(function(){
   $("html,body").stop().animate({"scrollTop":0},0);
 }) 
  $(".weima_1").click(function(){
	 $(".sao").toggleClass("hover")
	 return false;
	 })
 $(document).click(function(){
	 $(".sao").removeClass("hover");
	 })
 $(".weima_2").click(function(){
	 $(".sao1").toggleClass("hover")
	 return false;
	 })
   $(document).click(function(){
	 $(".sao1").removeClass("hover");
	 })

 
 
 
})








