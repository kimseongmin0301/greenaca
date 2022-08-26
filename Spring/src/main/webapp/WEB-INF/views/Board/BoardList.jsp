<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/CSS/BoardList_CSS/boardList.css?14" type="text/css"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
</head>
<body>
<div id="wrap">
    <div id="container">
        <div id="content">
            <div id="navigation">
                <ul>
                    <li class="dropdown">
                        <a href="#" class="dropdownbutton">레시피</a>
                        <div class="dropdown-content">
                            <a href="#">빵</a>
                            <a href="#">면</a>
                            <a href="#">고기</a>
                        </div>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdownbutton">요리</a>
                        <div class="dropdown-content">
                            <a href="#">한식</a>
                            <a href="#">중식</a>
                            <a href="#">양식</a>
                        </div>
                    </li>
                    <li><a href="#">잡담</a></li>
                    <li><a href="#">실시간채팅</a></li>
                </ul>
            </div>

            <div class="board_title" id="board_title">
                <div class="board_title header">
                    <h1>
                        빵
                    </h1>
                </div>
                <div>
                    <table class="tb_nav">
                        <tr>
                            <td id="home"><a href="/bread"><span>🏠</span></a></td>
                            <td id="best"><a href="#"><span>인기</span></a></td>
                            <td class="show_view"><a href="###">👍</a>
                                <a href="###">👍</a>
                            </td>
                        </tr>
                    </table>
                </div>
            </div>

            <div id="board_main">
                <div id="board_list">
                    <table class="tb_nav list">
                        <thead>
                        <tr>
                            <th class="list_cnt">글번호</th>
                            <th class="list_title">제목</th>
                            <th class="list_user">글쓴이</th>
                            <th class="list_cnt">조회수</th>
                            <th class="list_date">날짜</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="board" items="${list}">
                            <tr>
                                <td class="list_cnt">${board.bno}</td>
                                <td class="list_title" id="lt"><a
                                        href="/boardDetail?bno=${board.bno}">${board.title}</a></td>
                                <td class="list_user"></td>
                                <td class="list_cnt">${board.cnt}</td>
                                <td class="list_date">${board.regdate}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
                <div id="board_footer">
                    <form action="/bread" method="get" accept-charset="utf-8" id="searchForm">
                        <div id="search">
                            <div class="search_inside">
                                <input type="text" size="10" id="search_bar" name="keyword">
                                <input type="button" value="🔍" id="search_btn">
                                <select name="type">
                                    <option value="c">내용</option>
                                    <option value="t">제목</option>
                                    <option value="tc">제목+내용</option>
                                </select>
                                <input type="text" name="pageNum" value="${paging.criteriaVO.pageNum}" hidden>
<%--                                <input type="text" name="amount" value="${paging.criteriaVO.amount}" hidden>--%>
                            </div>
                        </div>
                    </form>
                    <form action="/boardWrite" method="get">
                        <div id="list_btns">
                            <input type="submit" value="글쓰기" id="btn_write">
                        </div>
                    </form>
                </div>
                <div id="paging">
                    <c:if test="${paging.prevBtn}">
                        <a href="/bread?keyword=${paging.criteriaVO.keyword}&type=${paging.criteriaVO.type}&pageNum=${paging.startPage-1}&amount=${paging.criteriaVO.amount}">이전</a>
                    </c:if>
                    <c:forEach begin="${paging.startPage}" end="${paging.endPage}" var="num">
                        <a href="/bread?keyword=${paging.criteriaVO.keyword}&type=${paging.criteriaVO.type}&pageNum=${num}">${num}</a>
                    </c:forEach>
                    <c:if test="${paging.nextBtn}">
                        <a href="/bread?keyword=${paging.criteriaVO.keyword}&type=${paging.criteriaVO.type}&pageNum=${paging.endPage+1}&amount=${paging.criteriaVO.amount}">다음</a>
                    </c:if>
                </div>
                <img src="/api/img/" />
            </div>
            <c:if test="${customer != null}">
                <a href="/logout">로그아웃</a>
            </c:if>
        </div>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="/resources/JS/List.js"></script>
</body>
</html>