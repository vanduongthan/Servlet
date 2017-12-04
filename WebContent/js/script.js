function PreviewImage() {
	var oFReader = new FileReader();
	oFReader.readAsDataURL(document.getElementById("uploadImage").files[0]);
	oFReader.onload = function(oFREvent) {
		document.getElementById("uploadPreview").src = oFREvent.target.result;
	};
};

function checkName() {

	var firstname = document.getElementById("firstname").value;
	var lastname = document.getElementById("lastname").value;
	if (isNaN(firstname)==false || isNaN(lastname)==false ) {
		alert("Ho ten khong bao gom so, moi nhap lai !");
		return false;
	}
	return true;
}
function checkNumber() {
	phone1 = document.getElementById("number1").value;
	phone2 = document.getElementById("number2").value;
	phone3 = document.getElementById("number3").value;
	if (isNaN(phone1) ||isNaN(phone2) ||isNaN(phone3)  ) {		
		alert(" Chi nhap so vao Phone number, moi nhap lai !");
		return false;
	}	
	return true;
}
function setCookie(cname, cvalue, exdays) {
    var d = new Date();
    d.setTime(d.getTime() + (exdays * 24 * 60 * 60 * 1000));
    var expires = "expires="+d.toUTCString();
    document.cookie = cname + "=" + cvalue + ";" + expires + ";path=/";
}

function getCookie(cname) {
    var name = cname + "=";
    var ca = document.cookie.split(';');
    for(var i = 0; i < ca.length; i++) {
        var c = ca[i];
        while (c.charAt(0) == ' ') {
            c = c.substring(1);
        }
        if (c.indexOf(name) == 0) {
            return c.substring(name.length, c.length);
        }
    }
    return "";
}

function checkCookie() {
    var user = getCookie("username");
    if (user != "") {
        alert("Welcome again " + user);
    } else {
        user = prompt("Please enter your name:", "");
        if (user != "" && user != null) {
            setCookie("username", user, 365);
        }
    }
}
