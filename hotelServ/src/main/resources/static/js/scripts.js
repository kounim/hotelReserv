/*!
* Start Bootstrap - Simple Sidebar v6.0.6 (https://startbootstrap.com/template/simple-sidebar)
* Copyright 2013-2023 Start Bootstrap
* Licensed under MIT (https://github.com/StartBootstrap/startbootstrap-simple-sidebar/blob/master/LICENSE)
*/
// 
// Scripts
// 

var positions = [
    {
        content:
       	'<div style="padding:5px;">' +
        '호텔1 <br>'+
        '	<div>'+
        '		<img src="https://cfile181.uf.daum.net/image/250649365602043421936D" width="73" height="70">' +
        '	</div>' +
        '	<a href="https://map.kakao.com/link/map/Hello World!,33.450701,126.570667" style="color:blue" target="_blank">예약페이지로</a>' +
        '</div>',	
        latlng: new kakao.maps.LatLng(37.458983, 127.126529)
    },
    {
    	content:
           	'<div style="padding:5px;">' +
            '호텔2 <br>'+
            '	<div>'+
            '		<img src="https://cfile181.uf.daum.net/image/250649365602043421936D" width="73" height="70">' +
            '	</div>' +
            '	<a href="https://map.kakao.com/link/map/Hello World!,33.450701,126.570667" style="color:blue" target="_blank">예약페이지로</a>' +
            '</div>',
        latlng: new kakao.maps.LatLng(37.460635, 127.126562)
    },
    {
    	content:
           	'<div style="padding:5px;">' +
            '호텔3 <br>'+
            '	<div>'+
            '		<img src="https://cfile181.uf.daum.net/image/250649365602043421936D" width="73" height="70">' +
            '	</div>' +
            '	<a href="https://map.kakao.com/link/map/Hello World!,33.450701,126.570667" style="color:blue" target="_blank">예약페이지로</a>' +
            '</div>',
        latlng: new kakao.maps.LatLng(33.451393, 126.570738)
    },
    {
    	content:
           	'<div style="padding:5px;">' +
            '호텔4 <br>'+
            '	<div>'+
            '		<img src="https://cfile181.uf.daum.net/image/250649365602043421936D" width="73" height="70">' +
            '	</div>' +
            '	<a href="https://map.kakao.com/link/map/Hello World!,33.450701,126.570667" style="color:blue" target="_blank">예약페이지로</a>' +
            '</div>',
    latlng: new kakao.maps.LatLng(37.458616, 127.126513)
    },
    
];


for (var i = 0; i < positions.length; i ++) {
    var marker = new kakao.maps.Marker({
        map: map,
        position: positions[i].latlng
    });

    var infowindow = new kakao.maps.InfoWindow({
        content: positions[i].content,
        removable:true
    });

    kakao.maps.event.addListener(marker, 'click', makeOverListener(map, marker, infowindow));

}

function makeOverListener(map, marker, infowindow) {
    return function() {
        infowindow.open(map, marker);
    };
}

// 인포윈도우를 닫는 클로저를 만드는 함수입니다 
function makeOutListener(infowindow) {
    return function() {
        infowindow.close();
    };
}





window.addEventListener('DOMContentLoaded', event => {

    // Toggle the side navigation
    const sidebarToggle = document.body.querySelector('#sidebarToggle');
    if (sidebarToggle) {
        // Uncomment Below to persist sidebar toggle between refreshes
        // if (localStorage.getItem('sb|sidebar-toggle') === 'true') {
        //     document.body.classList.toggle('sb-sidenav-toggled');
        // }
        sidebarToggle.addEventListener('click', event => {
            event.preventDefault();
            document.body.classList.toggle('sb-sidenav-toggled');
            localStorage.setItem('sb|sidebar-toggle', document.body.classList.contains('sb-sidenav-toggled'));
        });
    }

});
