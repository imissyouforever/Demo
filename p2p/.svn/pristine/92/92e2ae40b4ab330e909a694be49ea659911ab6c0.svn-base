function getMoveStyle() {
    var a = ["absolute", !1],
    b = document.createElement("div");
    return "oninput" in b && ["", "moz", "ms", "webkit"].forEach(function(c) {
        var d = c + (c ? "A": "a") + "nimation",
        e = c + (c ? "T": "t") + "ransform";
        d in b.style && (a[1] = !0),
        e in b.style && (a[0] = e)
    }),
    a
}
function pageAdapt(a, b) {
    var c = $(window).height(),
    d = Math.max(b, c);
    return a.each(function() {
        $(this).css("height", d + "px")
    }),
    d
}
function TimeLine(a) {
    this.obj = a.obj,
    this.stepMap = a.stepMap,
    this.currentTime = 0,
    this.totalTime = a.totalTime,
    this.loop = a.loop,
    this.timer = null
}
function SpritePlayer(a) {
    this.spriteObj = a.spriteObj,
    this.spriteWidth = a.spriteWidth,
    this.totalSpriteNum = a.totalSpriteNum,
    this.delay = a.delay || {},
    this.playTimer = null
}
function Arrow(a) {
    this.type = a.type || "big",
    this.rotate = a.rotate || {
        big: "-45deg",
        small: "-25deg"
    },
    this.arrowStart = a.arrowStart,
    this.arrowTarget = a.arrowTarget,
    this.$arrowHolder = a.$arrowHolder,
    this.moveStyle = a.moveStyle || getMoveStyle()[0],
    this.$crash = a.$crash,
    this.timeLine = null,
    this.arrow = null,
    this.currentStep = 0,
    this.init()
}
function getRandom(a, b) {
    var c = 0 | Math.random() * (b - a) + a;
    return c
}
function changeTag(a, b, c, d, e) {
    a.each(function(f) {
        $(this).bind(d,
        function() {
            a.removeClass(c),
            b.hide(),
            $(this).addClass(c),
            b.eq(f).show(),
            e && e($(this))
        })
    })
}
TimeLine.prototype = {
    init: function() {
        var a = this;
        void 0 == this.loop && (this.loop = !0),
        a.timer = setInterval(function() {
            var b = a.stepMap["t-" + a.currentTime];
            if (b) for (var c = 0; c < b.length; c++) a.obj[b[c]]();
            a.currentTime += 100,
            a.currentTime > a.totalTime && (a.loop ? a.currentTime = 0 : a.destroy())
        },
        100)
    },
    destroy: function() {
        clearInterval(this.timer),
        this.currentTime = 0
    }
},
SpritePlayer.prototype = {
    play: function() {
        function d() {
            b++,
            c -= a.spriteWidth,
            b >= a.totalSpriteNum && (b = 0, c = 0),
            a.spriteObj.css("backgroundPosition", c + "px 0px");
            var e = a.delay["sprite-" + b] || 30;
            a.playTimer = setTimeout(function() {
                d()
            },
            e)
        }
        var a = this,
        b = 0,
        c = 0;
        d()
    },
    destroy: function() {
        clearTimeout(this.playTimer)
    }
},
Arrow.prototype = {
    init: function() {
        this.stepMap = {
            "t-0": ["create"],
            "t-100": ["shoot"],
            "t-400": ["crash", "shoot"],
            "t-600": ["crashHide"],
            "t-700": ["shoot"],
            "t-3800": ["arrowHide"],
            "t-4000": ["destroy"]
        },
        this.timeLine = new TimeLine({
            obj: this,
            stepMap: this.stepMap,
            totalTime: 4e3,
            loop: !1
        }),
        this.timeLine.init()
    },
    create: function() {
        var a = this,
        b = $('<div class="arrow shootArrow"></div>');
        b.css({
            left: a.arrowStart[a.type][0],
            top: a.arrowStart[a.type][1]
        }),
        b.css(a.moveStyle, "translate(0px,0px)  rotate(" + a.rotate[a.type] + ")"),
        a.$arrowHolder.append(b),
        a.arrow = b
    },
    crash: function() {
        this.$crash.show()
    },
    crashHide: function() {
        this.$crash.hide()
    },
    shoot: function() {
        this.currentStep++;
        var a = this.currentStep,
        b = this.arrowTarget["step" + a][0],
        c = this.arrowTarget["step" + a][1],
        d = this.arrowTarget["step" + a][2],
        e = this.arrowTarget["step" + a][3];
        this.arrow.css(this.moveStyle, "translate(" + b + "," + c + ")  rotate(" + d + ")"),
        this.arrow.css("backgroundPosition", e + " 50%")
    },
    arrowHide: function() {
        var a = this;
        a.arrow.css("opacity", 0)
    },
    destroy: function() {
        this.arrow.remove()
    }
};