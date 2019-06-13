<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<div class="col-md-2">
	<ul class="nav nav-pills nav-stacked" id="nav">
		<li><a href=${pageContext.request.contextPath}/admin/courselist>课程管理<span
				class="badge pull-right">8</span></a></li>
		<li><a href=${pageContext.request.contextPath}/admin/studentlist>学生管理<span
				class="badge pull-right">59</span></a></li>
		<li><a href=${pageContext.request.contextPath}/admin/teacherlist>教师管理<span
				class="badge pull-right">10</span></a></li>
		<li><a href=${pageContext.request.contextPath}/admin/userlist>用户管理<span
				class="badge pull-right">10</span></a></li>
		<li><a href=${pageContext.request.contextPath}/admin/update>修改密码<sapn
					class="glyphicon glyphicon-pencil pull-right" /></a></li>
		<li><a href=${pageContext.request.contextPath}/user/logout>退出系统<sapn
					class="glyphicon glyphicon-log-out pull-right" /></a></li>
	</ul>
</div>