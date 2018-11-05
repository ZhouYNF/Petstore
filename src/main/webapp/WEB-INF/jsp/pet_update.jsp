<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--显示与数据分离--%>

<%--显示区--%>
<form action="<c:url value="/pet/update" />" method="post" class="form-horizontal">
    <div class="modal fade" id="myModal" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    <h4 class="modal-title" id="myModalLabel">更新动物信息</h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <label for="id" class="col-sm-2 control-label">ID</label>
                        <div class="col-sm-10">
                            <input type="text" id="id" readonly="readonly" class="form-control" name="id">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="pet_name" class="col-sm-2 control-label">动物名字</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="pet_name" placeholder="动物名字" name="pet_name">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="pet_photoUrls" class="col-sm-2 control-label">动物图片</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="pet_photoUrls" placeholder="动物图片" name="pet_photoUrls">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="pet_status" class="col-sm-2 control-label">动物状态</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="pet_status" placeholder="动物状态" name="pet_status">
                        </div>
                    </div>

                </div>
                <div class="modal-footer">
                    <div><input type="submit" class="btn btn-primary" value="提交更新"></div>
                </div>
            </div>
        </div>
    </div>
</form>

<%--数据区--%>
<script>
    $("#myModal").on("show.bs.modal", function (e) {
        var id = $(e.relatedTarget).data("id");
        $.ajax({
            method: "get",
            url: "<c:url value="/getBookById" />",
            data: {id: id}
        }).done(function (data) {
            $("#id").val(data.id);
            $("#name").val(data.name);
            $("#kucun").val(data.kucun);
        }).fail(function (xhr, textStatus, errorThrown) {
            console.error(errorThrown);
        }).always(function () {

        });
    });
</script>