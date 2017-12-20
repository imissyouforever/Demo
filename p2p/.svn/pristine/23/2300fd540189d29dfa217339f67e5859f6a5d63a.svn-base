function scrollBoard() {
    function k(a) {
        switch (j = !0, a) {
        case "left":
            i += g;
            var c = function() {
                j = !1,
                0 == i && (i = -h, e.css("left", -h + "px"))
            };
            break;
        case "right":
            i -= g;
            var c = function() {
                j = !1,
                Math.abs(i) >= Math.abs(2 * h - g) && (i += h, e.css("left", i + "px"))
            }
        }
        e.animate({
            left: i + "px"
        },
        b, c)
    }
    var a = $(".scroll-holder"),
    b = 500,
    c = a.siblings(".prev-btn"),
    d = a.siblings(".next-btn"),
    e = a.children("ul"),
    f = e.children("li"),
    g = f.eq(0).outerWidth(),
    h = g * f.length;
    e.html(e.html() + e.html()),
    e.css("left", -h + "px");
    var i = -h,
    j = !1;
    c.bind("click",
    function() {
        j || k("left")
    }),
    d.bind("click",
    function() {
        j || k("right")
    })
}
function showJuejinBenefit() {
    var a = new Date;
    a.setTime(a.getTime() - 864e6);
    var b = a.Format("yyyy-MM-dd");
    $.ajax({
        url: "http://tu.jr.jd.com/service/fundHistoryIndexBoth/000581,000569?t=0&time=" + b,
        type: "GET",
        dataType: "jsonp",
        success: function(a) {
            var b = a[0].data,
            c = new Number(b[b.length - 1][1]).toFixed(4),
            d = a[2].data,
            e = new Number(d[d.length - 1][1]).toFixed(4),
            f = a[1].data,
            g = new Number(f[f.length - 1][1]).toFixed(4),
            h = a[3].data,
            i = new Number(h[h.length - 1][1]).toFixed(4);
            g >= i ? calcuteBenefit(g) : calcuteBenefit(i),
            c >= e ? $("#jjone-1").html(c) : $("#jjone-1").html(e),
            $("#js2").html(c),
            $("#ph2").html(e),
            scrollBoard()
        }
    })
}
function calcuteBenefit(a) {
    function f(a) {
        d.each(function() {
            var c = $(this).attr("data-name"),
            d = g(a, b[c]);
            $(this).html(d)
        })
    }
    function g(a, b) {
        var c = "";
        return c = /^\d+$/g.test(parseInt(a)) ? (a * b).toFixed(2) : "--,--"
    }
    var b = {
        coffer: a / 1e4,
        hq: .0035 / 365,
        dq: .0325 / 365
    },
    c = $("#page2Input"),
    d = $("#resultBoard").find("span"),
    e = $("#calculateBtn");
    f(1e4),
    e.bind("click",
    function() {
        var a = c.val().replace(/[\s\,]/g, "");
        f(a)
    })
}
var animate = {
    canAnimate: getMoveStyle()[1],
    moveStyle: getMoveStyle()[0],
    page1: {
        $sun: $("#page1Sun"),
        $gold: $("#page1Gold"),
        spritePlayer: null,
        play: function() {
            var a = animate.page1;
            animate.canAnimate ? a.$sun.addClass("sunrise") : a.$sun.css("top", "35px").stop().animate({
                top: "0px"
            },
            {
                duration: 1e3,
                easing: "easeOutBounce"
            }),
            a.spritePlayer || (a.spritePlayer = new SpritePlayer({
                spriteObj: a.$gold,
                spriteWidth: 121,
                totalSpriteNum: 26,
                delay: {
                    "sprite-1": 800,
                    "sprite-13": 800
                }
            })),
            a.spritePlayer.play()
        },
        reset: function() {
            var a = animate.page1;
            animate.canAnimate ? a.$sun.removeClass("sunrise") : a.$sun.css("top", "35px"),
            a.spritePlayer && a.spritePlayer.destroy()
        }
    },
    page2: {
        $star: $("#page2Stars"),
        $cloud: $("#page2Clouds"),
        $sun: $("#page2Sun"),
        $sky: $("#page2Sky"),
        $gold: $("#page2Gold"),
        $beat: $("#page2Beat"),
        $input: $("#page2Input"),
        timeLine: null,
        totalTime: 7e3,
        stepMap: {
            "t-0": ["starRise", "sunFall"],
            "t-2700": ["starFall", "sunRise", "nightToDay"],
            "t-3000": ["throwGold"],
            "t-3200": ["beat"],
            "t-3400": ["beatHide"],
            "t-4000": ["sunLaugh"],
            "t-4800": ["sunClam"],
            "t-5500": ["sunLaugh"],
            "t-6300": ["sunClam"],
            "t-7000": ["dayToNight"]
        },
        play: function() {
            var a = animate.page2;
            a.timeLine || (a.timeLine = new TimeLine({
                obj: a,
                stepMap: a.stepMap,
                totalTime: a.totalTime
            }));
            var b = $.trim(a.$input.val()) || "10000";
            a.$input.val("").focus().val(b),
            a.reset(),
            a.timeLine.init()
        },
        throwGold: function() {
            var a = animate.page2;
            animate.canAnimate ? a.$gold.show().addClass("throwGold") : a.$gold.show().animate({
                left: "910px",
                top: "210px"
            },
            {
                duration: 175,
                easing: "easeInQuad"
            }).animate({
                left: "1110px",
                top: "160px"
            },
            {
                duration: 250,
                easing: "easeInQuad"
            }).animate({
                left: "1310",
                top: "230px"
            },
            {
                duration: 250,
                easing: "linear"
            })
        },
        sunLaugh: function() {
            var a = animate.page2;
            a.$sun.addClass("sunLaugh")
        },
        sunClam: function() {
            var a = animate.page2;
            a.$sun.removeClass("sunLaugh")
        },
        beat: function() {
            var a = animate.page2;
            a.$beat.show()
        },
        beatHide: function() {
            var a = animate.page2;
            a.$beat.hide()
        },
        starRise: function() {
            var a = animate.page2;
            a.$star.stop().animate({
                top: "0"
            },
            {
                duration: 700,
                easing: "easeOutQuad"
            })
        },
        starFall: function() {
            var a = animate.page2;
            a.$star.animate({
                top: "100%"
            },
            {
                duration: 700,
                easing: "easeInQuad"
            })
        },
        sunRise: function() {
            var a = animate.page2;
            a.$sun.stop().animate({
                top: "28px"
            },
            {
                duration: 1e3,
                easing: "easeOutBack"
            })
        },
        sunFall: function() {
            var a = animate.page2;
            a.$sun.animate({
                top: "169px"
            },
            {
                duration: 1e3,
                easing: "easeInQuad"
            })
        },
        dayToNight: function() {
            var a = animate.page2;
            a.$cloud.animate({
                left: "-20%",
                opacity: 0
            },
            {
                duration: 500,
                easing: "easeInQuad"
            }),
            a.$sky.css("backgroundColor", "#f5944f").removeClass("nightToDay").addClass("dayToNight")
        },
        nightToDay: function() {
            var a = animate.page2;
            a.$cloud.animate({
                left: "0",
                opacity: 1
            },
            {
                duration: 1e3,
                easing: "easeOutQuad"
            }),
            a.$sky.css("backgroundColor", "#f5944f").removeClass("dayToNight").addClass("nightToDay"),
            a.$gold.hide().removeClass("throwGold").css({
                left: "820px",
                top: "185px"
            })
        },
        reset: function() {
            var a = animate.page2;
            a.timeLine.destroy(),
            a.$star.stop().css("top", "100%"),
            a.$gold.stop().hide().removeClass("throwGold").css({
                left: "820px",
                top: "185px"
            }),
            a.$beat.hide(),
            a.$sun.stop().css("top", "169px").removeClass("sunLaugh"),
            a.$cloud.stop().css({
                opacity: "0",
                left: "-20%"
            }),
            a.$sky.stop().css("backgroundColor", "#f5944f").removeClass("nightToDay").removeClass("dayToNight")
        }
    },
    page3: {
        $cloud: $("#page3Cloud"),
        $rightHand: $("#page3RightHand"),
        $light: $("#page3Light"),
        $stars: $("#page3Stars"),
        $boy: $("#page3BoyHolder").children(".boy"),
        $cloth: $("#page3Cloth"),
        $money: $("#page3Money"),
        currentCloth: 1,
        totalCloth: 4,
        cloudTimer: null,
        timeLine: null,
        totalTime: 3500,
        stepMap: {
            "t-200": ["handClick"],
            "t-400": ["changeCloth", "moneyFly"],
            "t-500": ["changeBoy"],
            "t-1000": ["clearLight"]
        },
        play: function() {
            var a = animate.page3;
            a.timeLine || (a.timeLine = new TimeLine({
                obj: a,
                stepMap: a.stepMap,
                totalTime: a.totalTime
            })),
            a.reset().cloudFloat(),
            a.timeLine.init()
        },
        cloudFloat: function() {
            var a = animate.page3;
            if (a.$cloud.addClass("cloudFloat"), !animate.canAnimate) {
                var b = 0;
                a.cloudTimer = setInterval(function() {
                    b++,
                    a.$cloud.css("backgroundPosition", b + "px 50%"),
                    b >= 1920 && (b = 0)
                },
                30)
            }
        },
        handClick: function() {
            var a = animate.page3;
            animate.canAnimate ? a.$rightHand.addClass("handClick") : a.$rightHand.animate({
                top: 255
            },
            300).animate({
                top: 248
            },
            300)
        },
        moneyFly: function() {
            var a = animate.page3;
            a.$money.css({
                left: "1250px",
                top: "285px",
                opacity: 0
            }).animate({
                opacity: 1,
                left: 1340,
                top: 215
            },
            {
                duration: 800,
                easing: "easeInQuad"
            }).animate({
                opacity: 1,
                left: 1500,
                top: 0
            },
            2e3).animate({
                opacity: 0
            },
            500)
        },
        changeCloth: function() {
            var a = animate.page3;
            animate.canAnimate ? a.$stars.show() : a.$stars.show().animate({
                opacity: 1
            },
            300),
            a.$light.show().animate({
                opacity: .8
            },
            300),
            a.$cloth.animate({
                left: -125 * a.currentCloth + "px"
            },
            300,
            function() {
                a.currentCloth++,
                a.currentCloth > a.totalCloth && (a.currentCloth = 1, a.$cloth.css("left", "0"))
            })
        },
        changeBoy: function() {
            var a = animate.page3,
            b = a.currentCloth - 1,
            c = a.currentCloth >= a.totalCloth ? 0 : a.currentCloth;
            a.$boy.eq(b).animate({
                opacity: 0
            },
            500),
            a.$boy.show().eq(c).animate({
                opacity: 1
            },
            500)
        },
        clearLight: function() {
            var a = animate.page3;
            animate.canAnimate ? (a.$stars.hide(), a.$rightHand.removeClass("handClick")) : a.$stars.animate({
                opacity: 0
            },
            300),
            a.$light.animate({
                opacity: 0
            },
            500)
        },
        reset: function() {
            var a = animate.page3;
            return clearInterval(a.cloudTimer),
            a.currentCloth = 1,
            a.$cloud.stop().css("backgroundPosition", "0px 50%"),
            a.$rightHand.stop().removeClass("handClick"),
            a.$cloth.stop().css("left", "0"),
            a.$boy.stop().attr("style", ""),
            a.$money.stop().css({
                left: "1250px",
                top: "285px",
                opacity: 0
            }),
            a.$stars.hide().css("opacity", 0),
            a.$light.hide().css("opacity", 0),
            a.timeLine && a.timeLine.destroy(),
            a
        }
    },
    page4: {
        $arrowHolder: $("#page4ArrowHolder"),
        $crash: $("#page4Crash"),
        $arrowStatic: $("#page4ArrowStatic"),
        $cloudBig: $("#page4CloudBig"),
        $cloudSmall: $("#page4CloudSmall"),
        $gold: $("#page4Gold"),
        arrowTimer: null,
        currentType: "small",
        spritePlayer: null,
        arrowStart: {
            big: ["870px", "140px"],
            small: ["970px", "155px"]
        },
        step1Target: {
            big: ["-85px", "110px"],
            small: ["-185px", "80px"]
        },
        step2Target: {
            big: 100,
            small: 0
        },
        timeLine: null,
        totalTime: 2e3,
        stepMap: {
            "t-0": ["openMouth", "shootArrow"],
            "t-200": ["shootArrow"],
            "t-600": ["closeMouth"]
        },
        play: function() {
            var a = animate.page4;
            animate.canAnimate ? (a.timeLine || (a.timeLine = new TimeLine({
                obj: a,
                stepMap: a.stepMap,
                totalTime: a.totalTime
            })), a.reset(), a.timeLine.init()) : a.$arrowStatic.show(),
            a.spritePlayer || (a.spritePlayer = new SpritePlayer({
                spriteObj: a.$gold,
                spriteWidth: 91,
                totalSpriteNum: 26,
                delay: {
                    "sprite-1": 800,
                    "sprite-13": 800
                }
            })),
            a.spritePlayer.play()
        },
        openMouth: function() {
            var a = animate.page4;
            return a.currentType = "big" == a.currentType ? "small": "big",
            "big" == a.currentType ? a.$cloudBig.addClass("cloud-big-open") : a.$cloudSmall.addClass("cloud-small-open"),
            a
        },
        closeMouth: function() {
            var a = animate.page4;
            a.$cloudBig.removeClass("cloud-big-open"),
            a.$cloudSmall.removeClass("cloud-small-open")
        },
        shootArrow: function() {
            var a = animate.page4;
            a.createArrow(a.currentType)
        },
        createArrow: function(a) {
            var b = animate.page4,
            c = getRandom( - 150, 60),
            d = getRandom( - 10, 40),
            e = getRandom( - 30, 30),
            f = {
                step1: [b.step1Target[a][0], b.step1Target[a][1], "-45deg", "0px"],
                step2: [b.step2Target[a] + c + "px", 300 + d + "px", 545 + e + "deg", "-105px"],
                step3: [b.step2Target[a] + c + "px", 300 + d + "px", 545 + e + "deg", "-210px"]
            };
            new Arrow({
                type: a,
                arrowStart: b.arrowStart,
                arrowTarget: f,
                $arrowHolder: b.$arrowHolder,
                $crash: b.$crash,
                moveStyle: animate.moveStyle
            })
        },
        reset: function() {
            var a = animate.page4;
            a.$arrowHolder.html(""),
            a.$arrowStatic.hide(),
            a.closeMouth(),
            a.timeLine && a.timeLine.destroy(),
            a.spritePlayer && a.spritePlayer.destroy()
        }
    },
    page5: {
        $sun: $("#page5Sun"),
        $goldHolder: $("#page5GoldHolder"),
        $goldFront: $("#page5GoldFront"),
        $goldBack: $("#page5GoldBack"),
        $light: $("#page5Light"),
        timeLine: null,
        totalTime: 5e3,
        stepMap: {
            "t-0": ["goldFall", "sunJump"],
            "t-2000": ["goldUp"],
            "t-2500": ["goldDown"],
            "t-4500": ["clearGold"]
        },
        play: function() {
            var a = animate.page4
			;
            a.timeLine || (a.timeLine = new TimeLine({
                obj: a,
                stepMap: a.stepMap,
                totalTime: a.totalTime
            })),
            a.reset(),
            a.timeLine.init()
        },
        goldFall: function() {
            for (var a = animate.page4,
            b = $(window).height(), c = 0; 88 > c; c++) a.createGold(b)
        },
        sunJump: function() {
            var a = animate.page4;
            animate.canAnimate ? a.$sun.addClass("sunJump") : a.$sun.stop().animate({
                bottom: "-20px"
            },
            300).animate({
                bottom: "0px"
            },
            {
                duration: 1e3,
                easing: "easeOutBounce"
            })
        },
        goldUp: function() {
            var a = animate.page4;
            a.$goldFront.css(animate.moveStyle, "translate3D(3px,-3px,0px)"),
            a.$goldBack.css(animate.moveStyle, "translate3D(-3px,3px,0px)")
        },
        goldDown: function() {
            var a = animate.page4;
            a.$goldFront.css(animate.moveStyle, "translate3D(0px,0px,0px)"),
            a.$goldBack.css(animate.moveStyle, "translate3D(0px,0px,0px)")
        },
        createGold: function(a) {
            var b = animate.page4,
            c = getRandom(40, 90),
            d = getRandom(5, 95),
            e = getRandom(50, 2e3),
            f = getRandom(1.5 * a, 2 * a),
            g = $('<img class="gold" src="/resources/xjk/images/page5-gold.png" />');
            g.css({
                top: "-100px",
                left: d + "%",
                width: c + "px"
            }),
            b.$goldHolder.append(g),
            setTimeout(function() {
                animate.canAnimate ? g.css(animate.moveStyle, "translate3D(0px," + f + "px,0px)") : g.animate({
                    top: f
                },
                2e3)
            },
            e)
        },
        clearGold: function() {
            var a = animate.page4;
            a.$goldHolder.html(""),
            a.$sun.removeClass("sunJump")
        },
        reset: function() {
            var a = animate.page4;
            a.$goldHolder.html(""),
            a.$sun.stop().removeClass("sunJump"),
            a.timeLine && a.timeLine.destroy()
        }
    }
},
pageControl = {
    currentPage: 0,
    targetPage: 0,
    stage: "",
    stageLayer: "",
    stageNum: 0,
    pageHeight: 0,
    scrolling: !1,
    canAnimate: "false",
    moveStyle: "absolute",
    resizeTimer: null,
    init: function(a) {
        var b = pageControl;
        b.stage = $("#stage"),
        b.stageLayer = $(".stage-layer"),
        b.stageNum = b.stageLayer.length,
        b.slideItem = $(".slideItem"),
        b.backtopBtn = b.slideItem.eq( - 1),
        b.fastBuyHolder = $("#fastBuyHolder");
        var c = getMoveStyle();
        b.moveStyle = c[0],
        b.canAnimate = c[1],
        b.bindEvent(),
        pageAdapt($("body"), 100),
        b.pageHeight = pageAdapt(b.stageLayer, 100),
        animate.page1.play();
        var a = a || 0;
        b.scrollTo(a)
    },
    bindEvent: function() {
        var a = pageControl;
        $(window).bind("resize",
        function() {
            clearTimeout(a.resizeTimer),
            a.resizeTimer = setTimeout(function() {
                a.pageHeight = pageAdapt(a.stageLayer, 100),
                pageAdapt($("body"), 100),
                a.scrollTo(a.currentPage, !0)
            },
            200)
        }),
        $(document).bind("mousewheel",
        function(b) {
            b.preventDefault(),
            a.scrolling || (a.targetPage = b.deltaY > 0 ? Math.max(0, a.currentPage - 1) : Math.min(a.stageNum - 1, a.currentPage + 1), a.scrollTo(a.targetPage))
        }).bind("keydown",
        function(b) {
            if (!a.scrolling) switch (b.keyCode) {
            case 38:
                a.targetPage = Math.max(0, a.currentPage - 1),
                a.scrollTo(a.targetPage);
                break;
            case 40:
                a.targetPage = Math.min(a.stageNum - 1, a.currentPage + 1),
                a.scrollTo(a.targetPage)
            }
            return 38 == b.keyCode || 40 == b.keyCode ? (b.preventDefault(), !1) : void 0
        }),
        a.slideItem.bind("click",
        function() {
            if (!a.scrolling) {
                var b = 0 | $(this).attr("data-target");
                $(this).addClass("current").siblings().removeClass("current"),
                a.targetPage = b,
                a.scrollTo(b)
            }
        })
    },
    scrollTo: function(a, b) {
        var c = pageControl;
        if (c.currentPage != a || b && 0 != a) {
            c.slideItem.eq(a).addClass("current").siblings().removeClass("current"),
            0 == a ? (c.backtopBtn.stop().animate({
                opacity: 0
            },
            300,
            function() {
                c.fastBuyHolder.hide()
            }), c.fastBuyHolder.stop().animate({
                opacity: 0
            },
            300,
            function() {
                c.backtopBtn.hide()
            })) : (c.backtopBtn.show().stop().animate({
                opacity: 1
            },
            300), c.fastBuyHolder.show().stop().animate({
                opacity: 1
            },
            300)),
            c.scrolling = !0,
            c.stageLayer.children().show(),
            4 == a && animate.page4.play(),
            c.pageScroll(a,
            function() {
                c.scrolling = !1,
                !b && animate["page" + (c.currentPage + 1)] && animate["page" + (c.currentPage + 1)].reset(),
                c.currentPage = a,
                !b && 4 != a && animate["page" + (c.currentPage + 1)] && animate["page" + (c.currentPage + 1)].play(),
                b || c.stageLayer.eq(c.currentPage).siblings().children().hide()
            });
            var d = $(".header");
            0 == a ? d.stop().animate({
                top: "0px"
            },
            500) : 0 == parseInt(d.css("top")) && $(".header").stop().animate({
                top: "-143px"
            },
            500)
        }
    },
    pageScroll: function(a, b) {
        var c = pageControl,
        d = a * c.pageHeight;
        c.canAnimate ? (c.stage.css(c.moveStyle, "translate3D(0px," + -d + "px,0px)"), setTimeout(function() {
            b && b()
        },
        1300)) : c.stage.animate({
            top: -d + "px"
        },
        {
            duration: 1e3,
            easing: "easeOutQuad",
            complete: function() {
                b && b()
            }
        })
    }
};
$(function() {
    pageControl.init(),
    function() {
        var a = $("#ercodeHolder"),
        b = a.children("div");
        a.bind("mouseenter",
        function() {
            b.stop().css("opacity", 1).show()
        }).bind("mouseleave",
        function() {
            b.stop().animate({
                opacity: 0
            },
            300,
            function() {
                b.hide()
            })
        })
    } (),
    function() {
        var a = !1,
        b = $(".f-copyright"),
        c = b.outerHeight();
        $("#footerBtn").bind("mouseenter",
        function() {
            a = !0,
            b.css({
                position: "absolute",
                bottom: -c + "px",
                top: ""
            }).stop().animate({
                bottom: 0
            },
            300)
        }),
        b.bind("mouseleave",
        function() {
            b.stop().animate({
                bottom: -c + "px"
            },
            300)
        })
    } (),
    function() {
        var a = $("#page6NavBar").children("li"),
        b = $("#page6NavCont").children(".cont"),
        c = $("#page6FloatSign");
        changeTag(a, b, "current", "mouseenter",
        function(a) {
            var b = 280 * a.index() + 60;
            c.stop().animate({
                left: b
            },
            {
                duration: 300,
                easing: "easeOutBack"
            })
        })
    } (),
    function() {
        var a = $("#page7ProList").children("li");
        a.bind("mouseenter",
        function() {
            $(this).find(".link-mask").show()
        }).bind("mouseleave",
        function() {
            $(this).find(".link-mask").hide()
        })
    } ()
}),
Date.prototype.Format = function(a) {
    var b = {
        "M+": this.getMonth() + 1,
        "d+": this.getDate(),
        "h+": this.getHours(),
        "m+": this.getMinutes(),
        "s+": this.getSeconds(),
        "q+": Math.floor((this.getMonth() + 3) / 3),
        S: this.getMilliseconds()
    };
    /(y+)/.test(a) && (a = a.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length)));
    for (var c in b) new RegExp("(" + c + ")").test(a) && (a = a.replace(RegExp.$1, 1 == RegExp.$1.length ? b[c] : ("00" + b[c]).substr(("" + b[c]).length)));
    return a
};
var cofferCent = 0;
$(document).ready(function() {
    showJuejinBenefit()
});