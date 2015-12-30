<!DOCTYPE html>
<html>
<head>
<title>MTS-app</title>
<link href="css/bootstrap.css" rel="stylesheet">
</head>
<body>

	<div class="container">
	
		<div class="page-header">MTS - transfer-demo</div>
	
		<div class="row">
		<div class="col -md-5">
			
			<form action="mts/txr" method="post">
			
				<div class="form-group">
					<label>Form Account:</label>
					<input name="fromAccNum" class="form-control">
				</div>
				<div class="form-group">
					<label>To Account:</label>
					<input name="toAccNum" class="form-control">
				</div>
				<div class="form-group">
					<label>Amount:</label>
					<input name="amount" class="form-control">
				</div>
				<button type="submit" class="btn btn-primary">Transfer</button>
			</form>
			
		</div>
	
	</div>
	</div>

</body>
</html>