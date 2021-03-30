var counter = 3;
		
function changeImage() {
	var nd = document.getElementById('img0');
	nd.style.width = '400px';
	nd.style.height = '400px';
	nd.src = 'images/adv'+counter+'.jpg';
	if(counter == 3) {
		counter--;
	} else 	if(counter == 2) {
		counter++;
	}
}