<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div id="addpet" class="modal fade" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document" style="width: 30%;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h3 class="modal-title">添加动物</h3>
            </div>
            <div class="modal-body">
                <div class="row" style="margin: 1rem;">
                    <div class="col-md-12">
                        <form class="form-horizontal" role="form" id="form1">
                            <div class="form-group">
                                <input type="text" class="form-control" id="pet_id" name="pet_id" placeholder="编号"/>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" id="pet_name" name="pet_name" placeholder="名字"/>
                            </div>
                            <div class="form-group">
                                <input type="file" class="form-control" id="pet_photoUrls" name="pet_photoUrls" placeholder="图片"/>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" id="pet_status" name="pet_status" placeholder="状态"/>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" id="pet_category_id" name="pet_category_id" placeholder="类型"/>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" id="pet_tags_id" name="pet_tags_id" placeholder="标签"/>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="addPet()">添加</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div>
<!-- /.modal -->
<script>
    function addPet() {
        $.ajax({
            type: "POST",
            url: "/pet/addPet",
            data: $('#form1').serialize(),// 序列化表单值
            async: false,
            error: function (request) {
                alert("Connection error");
            },
            success: function (data) {
                window.location.href = "/pet/page"
            }
        });
    }
</script>
</div>
