<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/common/header.jsp" %>
<div class="container">
    <div class="header">
        <ul class="nav nav-pills pull-right">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#">About</a></li>
            <li><a href="#">Contact</a></li>
        </ul>
        <h3 class="text-muted">HELLO SHOP</h3>
    </div>

    <div class="jumbotron">
        <h1>HELLO SHOP</h1>
        <p class="lead">회원 기능</p>
        <p>
            <a class="btn btn-lg btn-primary" href="/members/new">회원 가입</a>
            <a class="btn btn-lg btn-primary" href="/signup">상품 주문</a>
        </p>
        <p class="lead">관리자 기능2</p>
        <p>
            <a class="btn btn-lg btn-success" href="/signup">상품 등록</a>
            <a class="btn btn-lg btn-success" href="/signup">주문 내역</a>
        </p>
    </div>

    <div>
        <table class="table table-striped">
            <thead>
            <tr>
                <th>#</th>
                <th>이름</th>
                <th>연락처</th>
                <th>잔여포인트</th>
                <th>기능</th>
            </tr>
            </thead>
            <tbody>
            </tbody>
        </table>
    </div>



    <!-- Button trigger modal -->
    <a data-toggle="modal" href="#myModal" class="btn btn-primary btn-lg">Launch demo modal</a>
    <%--<button type="button" data-toggle="modal" data-target="#myModal">Launch modal</button>--%>

    <!-- Modal -->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title">Modal title</h4>
                </div>
                <div class="modal-body">
                    ...
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Save changes</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->


</div> <!-- /container -->
<%@ include file="/WEB-INF/views/common/footer.jsp" %>