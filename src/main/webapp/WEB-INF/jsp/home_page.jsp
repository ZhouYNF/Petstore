<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form>

</form:form>
<!--宠物列表 -->
<div class="row">
    <div class="col-md-2 column">
        <ul class="nav navcolor nav-pills nav-stacked">
            <li class="active">
                <a href="/LoginServlet">分类</a>
            </li>
            <c:forEach var="cate" varStatus="vs" items="${categories}">
                <li class="nav">
                    <a href="/TypeServlet?id=${cate.id}">${cate.name}</a>
                </li>
            </c:forEach>
        </ul>
    </div>
    <div class="col-md-10 column">
        <div class="row">
            <c:forEach var="pet" varStatus="vs" items="${PetList}">
                <div class="col-md-4">
                    <div class="thumbnail">
                        <img alt="300x300" src="${pet.pet_photoUrls}" />
                        <div class="caption">
                            <h3 style="color: red; font-weight: bold;">${pet.petstoreTag}</h3>
                            <p>
                                    ${pet.pet_status}/${pet.intro}
                            </p>
                            <p>
                                <a class="btn btn-primary addcart" href="/AddCart?id=${good.id}">加入购物车</a>
                            </p>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</div>
</body>
</html>
