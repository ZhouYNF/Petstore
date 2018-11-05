<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script src="../assets/js/jquery1.12.4.js"></script>
<script src="../assets/js/bootstrap.js"></script>
<link href="../assets/css/bootstrap.css" rel="stylesheet">
<link href="../assets/css/dashboard.css" rel="stylesheet">
<!--宠物列表 -->
<div class="row">
    <div class="col-md-2 column">
        <ul class="nav navcolor nav-pills nav-stacked">
            <li class="active">
                <a href="#">分类</a>
            </li>
            <c:forEach var="cate" varStatus="vs" items="${categoryList}">
                <li class="nav">
                    <a href="/pet/category?id=${cate.cg_id}">${cate.cg_name}</a>
                </li>
            </c:forEach>
        </ul>
    </div>

    <div style="margin-top: 2em;">
        <a href="#" id="addpet">添加</a>
    </div>
    <div id="modal"></div>

    <div class="col-md-10 column">
        <div class="row">
            <c:forEach var="pet" varStatus="vs" items="${petList}">
                <div class="col-md-4">
                    <div class="thumbnail">
                        <img alt="400x400" src="/img/${pet.pet_photoUrls}"/>
                        <div class="caption">
                            <h3 style="color: red; font-weight: bold;">${pet.pet_name}</h3>
                            <p>
                                    ${pet.pet_status}
                            </p>
                            <p>
                                <a href="/pet/del/${pet.pet_id}">
                                <button>删除</button>
                                </a>
                                <a href="#myModal" data-toggle="modal" data-id="${pet.pet_id}">
                                    <button>更新</button>
                                </a>
                            </p>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
    <%@ include file="pet_update.jsp" %>

    <script>
        $(function () {
            $("#addpet").on("click", function () {
                $("#modal").load("addPet.jsp", function () {
                    $('#addpet').modal('show');
                });
            });
        });
    </script>
</body>
</html>
