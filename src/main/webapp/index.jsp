<!DOCTYPE html>
<html ng-app="cavesApp">
<head>
<title>The Caves Web Edition</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap -->
<link href="styles/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="styles/starter-template.css" rel="stylesheet">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="scripts/jquery-2.0.3.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="scripts/bootstrap.min.js"></script>
<!-- Include AngularJS main -->
<script src="scripts/angular-1.2.0/angular.js"></script>
<script src="scripts/angular-1.2.0/angular-route.js"></script>
<!--  Angular Application -->
	<script src="scripts/cavesApp.js"></script>
<!--  Angular Controllers -->
<script src="scripts/controllers/cavesCtrl.js"></script>
</head>
<body>
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">The Caves</a>
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Play</a></li>
					<li><a href="#/scores">High Score</a></li>
					<li><a href="#/about">About</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>
	<div class="container">
		<div class="starter-template">
			<div ng-view></div>
		</div>
	</div>




</body>
</html>