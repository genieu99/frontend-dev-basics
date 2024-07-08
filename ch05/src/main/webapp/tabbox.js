var TabBox = {
    _onTableClicked: function () {
        $('.tab-box li.selected').removeClass('selected');
        $(this).addClass('selected');
    },
    _init: function() {
        $(".tab-box li").click(TabBox._onTableClicked);
    },
    init: function () {
        $(this._init);
    }
};