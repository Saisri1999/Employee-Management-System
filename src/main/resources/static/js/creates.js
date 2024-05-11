
function validateSubmit(){
		var a = document.forms["form"]["firstName"].value;
		var b = document.forms["form"]["lastName"].value;
		var c = document.forms["form"]["salary"].value;
		var d = document.forms["form"]["email"].value;
		var e = document.forms["form"]["age"].value;
		
		if (a == null || a == "", b == null|| b == "", c == null|| c == "", d == null|| d == "", e == null|| e == "") {
			alert("Please Fill All Required Fields");
			return false;
		} else {

			$.ajax({
				type : 'get',
				url : 'create_employee.html',
				data : $('form').serialize(),
				success : function() {
					alert('Data inserted Successfully.....');
					document.getElementById("form").reset();
				}
			});

		}
	

	$(function() {

		$('form').on('button', function(e) {
			e.preventDefault();

			validateSubmit();

		});
	});
}
