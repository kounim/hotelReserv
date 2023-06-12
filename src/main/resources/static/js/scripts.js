/*!
* Start Bootstrap - Simple Sidebar v6.0.6 (https://startbootstrap.com/template/simple-sidebar)
* Copyright 2013-2023 Start Bootstrap
* Licensed under MIT (https://github.com/StartBootstrap/startbootstrap-simple-sidebar/blob/master/LICENSE)
*/
// 
// Scripts
// 

var map = new kakao.maps.Map(mapContainer, mapOption);
						
var positions = [
//성남----------------------------------------------------------------------------------------------------------
    {
        content:
           	'<div style="padding:5px;">' +
            '성남호텔1 <br>'+
            '	<div>'+
            '		<img src="/images/sungnam1.png" width="73" height="70" width="73" height="70">' +
            '	</div>' +
            '	<a href="http://localhost:8080/reservation/sungnam1" style="color:blue" target="_blank">예약페이지로</a>' +
            '</div>',
        latlng: new kakao.maps.LatLng(37.458983, 127.126529)
    },
    {
    	content:
           	'<div style="padding:5px;">' +
            '성남호텔2 <br>'+
            '	<div>'+
            '		<img src="/images/sungnam2.png" width="73" height="70">' +
            '	</div>' +
            '	<a href="http://localhost:8080/reservation/sungnam2" style="color:blue" target="_blank">예약페이지로</a>' +
            '</div>',
        latlng: new kakao.maps.LatLng(37.460635, 127.126562)
    },
    {
    	content:
           	'<div style="padding:5px;">' +
            '호텔3 <br>'+
            '	<div>'+
            '		<img src="/images/hotel03.png" width="73" height="70" width="73" height="70">' +
            '	</div>' +
            '	<a href="http://localhost:8080/reservation/sungnam3" style="color:blue" target="_blank">예약페이지로</a>' +
            '</div>',
        latlng: new kakao.maps.LatLng(33.451393, 126.570738)
    },
    {
    	content:
           	'<div style="padding:5px;">' +
            '호텔4 <br>'+
            '	<div>'+
            '		<img src="/images/hotel03.png" width="73" height="70" width="73" height="70">' +
            '	</div>' +
            '	<a href="http://localhost:8080/reservation/sungnam4" style="color:blue" target="_blank">예약페이지로</a>' +
            '</div>',
    latlng: new kakao.maps.LatLng(37.458616, 127.126513)
    },
    
//부산----------------------------------------------------------------------------------------------------------
	{
        content:
       	'<div style="padding:5px;">' +
        '부산호텔1 <br>'+
        '	<div>'+
        '		<img src="/images/busan1.png" width="73" height="70" width="73" height="70">' +
        '	</div>' +
        '	<a href="http://localhost:8080/reservation/busan1" style="color:blue" target="_blank">예약페이지로</a>' +
        '</div>',
        latlng: new kakao.maps.LatLng(35.18074102854081, 129.07645438116108)
    },
    	{
        content:
       	'<div style="padding:5px;">' +
        '부산호텔2 <br>'+
        '	<div>'+
        '		<img src="/images/hotel01.png" width="73" height="70">' +
        '	</div>' +
        '	<a href="http://localhost:8080/reservation/busan2" style="color:blue" target="_blank">예약페이지로</a>' +
        '</div>',
        latlng: new kakao.maps.LatLng(35.18097309570512, 129.07237717282695)
    },
    	{
        content:
       	'<div style="padding:5px;">' +
        '부산호텔3 <br>'+
        '	<div>'+
        '		<img src="/images/hotel01.png" width="73" height="70">' +
        '	</div>' +
        '	<a href="http://localhost:8080/reservation/busan3" style="color:blue" target="_blank">예약페이지로</a>' +
        '</div>',
        latlng: new kakao.maps.LatLng(35.17944461567117, 129.07164687788404)
    },
    	{
        content:
       	'<div style="padding:5px;">' +
        '부산호텔4 <br>'+
        '	<div>'+
        '		<img src="/images/hotel01.png" width="73" height="70">' +
        '	</div>' +
        '	<a href="http://localhost:8080/reservation/busan4" style="color:blue" target="_blank">예약페이지로</a>' +
        '</div>',
        latlng: new kakao.maps.LatLng(35.17925563186152, 129.0726847898395)
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

/* 마커추가

function makemarker(ht_nm, image, url, x, y){
	let position={
		content:
		'<div style="padding:5px;">' +
        ht_nm+'<br>'+
        '	<div>'+
        '		<img src="images/'+image+'.png" width="73" height="70">' +
        '	</div>' +
        '	<a href="http://localhost:8080/'+url+'" style="color:blue" target="_blank">예약페이지로</a>' +
        '</div>',
		latlng: new kakao.maps.LatLng(x, y) 		
	}
	positions.push(position);
}

*/

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



/*
var ps = new kakao.maps.services.Places(); 
searchPlaces();
function searchPlaces() {

    var keyword = document.getElementById('keyword').value;

    if (!keyword.replace(/^\s+|\s+$/g, '')) {
        return false;
    }

    // 장소검색 객체를 통해 키워드로 장소검색을 요청합니다
    ps.keywordSearch( keyword, placesSearchCB); 
}

function placesSearchCB (data, status, pagination) {
    if (status === kakao.maps.services.Status.OK) {

        // 검색된 장소 위치를 기준으로 지도 범위를 재설정하기위해
        // LatLngBounds 객체에 좌표를 추가합니다
        var bounds = new kakao.maps.LatLngBounds();

        for (var i=0; i<data.length; i++) {
            displayMarker(data[i]);    
            bounds.extend(new kakao.maps.LatLng(data[i].y, data[i].x));
        }       

        // 검색된 장소 위치를 기준으로 지도 범위를 재설정합니다
        map.setBounds(bounds);
    } 
}

*/




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

