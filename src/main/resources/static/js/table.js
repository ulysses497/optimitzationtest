$('#table').bootstrapTable({
    method: 'get',
    url: "test.json", // 请求路径
    striped: true, // 是否显示行间隔色
    pageNumber: 1, // 初始化加载第一页
    pagination: true, // 是否分页
    sidePagination: 'client', // server:服务器端分页|client：前端分页
    pageSize: 5, // 单页记录数
    pageList: [5, 20, 30],
    // showRefresh : true,// 刷新按钮
    queryParams: function(params) { // 上传服务器的参数
        var temp = {
            name: $("#sname").val(),
            viewReason: $("#viewReason").val(),
        };
        return temp;
    },
    columns: [{
        checkbox: true
    }, {
        title: 'id',
        field: 'id',
        visible: false
    }, {
        title: '设备编号',
        field: 'deviceId',

    }, {
        title: '姓名',
        field: 'name',

    }, {
        title: '性别',
        field: 'sex',

    }, {
        title: '证件号码',
        field: 'card'
    }, {
        title: '联系电话',
        field: 'phone'
    }, {
        title: '被访姓名',
        field: 'viewPeople'
    }, {
        title: '来访事由',
        field: 'viewReason',
    }, {
        title: '来访时间',
        field: 'visitTime',
    }, {
        title: '是否离开',
        field: 'isLeave',
    }, {
        title: '操作',
        field: 'id',
    }]
})