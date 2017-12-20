$(document).ready(function(e){
/*ͷ��*/
 $(".logo dl dd").click(function(){
    $(".logo dl dd .city").toggle();
    return false;	
 })
 $(document).click(function(){
   $(".logo dl dd .city").hide();
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
/*��½*/
 $("#unsername").click(function(){
   $("#unsername").val("").css('color','#4c4c44');
 })
 $("#password").click(function(){
   $("#password").val("").css('color','#4c4c44');
 })
/*banner*/  
 var bnpage=0,
     bntimer,
     bnlen=$(".banner ul li").length;
	 
 $(".banner ol li").mouseover(function(){
   clearInterval(bntimer);
   bnpage=$(".banner ol li").index($(this));
   ban(bnpage);
 })
 
 $(".banner").hover(function(){
   clearInterval(bntimer);
 },function(){
   bntimer=setInterval(function(){
     if(bnpage<bnlen-1){
	   bnpage++;
	   ban(bnpage);
	 }else{
	   bnpage=0;
	   ban(bnpage);
	 }
   },2000)
 }).trigger("mouseleave");
 
 $(".banner .left,.banner .right").hover(function(){
   clearInterval(bntimer);
   $(this).addClass("hover");
 },function(){
   $(this).removeClass("hover");
 })
 
 $(".banner .left").click(function(){
   if(bnpage>0){
     bnpage--;
	 ban(bnpage);
   }else{
     bnpage=bnlen-1;
	 ban(bnpage);
   }
 })
 $(".banner .right").click(function(){
   if(bnpage<bnlen-1){
     bnpage++;
	 ban(bnpage);
   }else{
     bnpage=0;
	 ban(bnpage);
   }
 })
 
 function ban(bn){
   $(".banner ol li").eq(bn).addClass("hover").siblings().removeClass("hover");
   $(".banner ul li").eq(bn).show().siblings().hide();
 }
/*ʲô��ծ����*/
 $(".what dl").hover(function(){
   $(this).addClass("hover").siblings().removeClass("hover");
 },function(){
   $(this).removeClass("hover");
 })
/*����*/
 $(".content_l h2 ul li").click(function(){
   var index=$(".content_l h2 ul li").index($(this));
   $(this).addClass("hover").siblings().removeClass("hover");
   $(".content_l .info").eq(index).show().siblings().hide();
 })
 
 $(".content_l .liebiao").hover(function(){
   $(this).addClass("hover");
 },function(){
   $(this).removeClass("hover");
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

$(".genghuan").click(function(){
	 $(".zhaghu_1 li.ghsj").toggleClass("hover")
	 }) 
 
})