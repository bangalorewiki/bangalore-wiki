<script type="text/javascript">
	$(document).ready(function(){
		$("#menu ul li").mouseover(function(){
			$(this).addClass("onmenuover");
			//$(this).animate({background: "#ffffff", box-shadow: "0 2px 2px -1px rgba(0, 0, 0, 0.52)"}, 2000);
		});
		$("#menu ul li").mouseout(function(){
			$(this).removeClass("onmenuover");
		});
		$("#menu ul li").click(function(){
			$("#menu ul li").removeClass("onmenu");
			$(this).addClass("onmenu");
			$("#content-section").load("../bwiki/"+$(this).attr("id")+"/demo");
			
		});
	});
</script>
	<div id="menu">
		<ul>
			<li id="sites">Site Seeing</li>
			<li id="edu-institutions">Educational Institutions</li>
			<li id="theatres">Movie</li>
			<li id="discos">Disco's</li>
			<li id="parlors">Beauty Palours</li>
			<li id="pubs">Pubs</li>
			<li id="pizza-joints">Pizza Joints</li>
			<li id="coffee-bars">Coffee Bars</li>
			<li id="pool-parlors">Pool Palours</li>
			<li id="fast-foods">Fastfood</li>
			<li id="restaurants">Restuarants</li>
			<li id="bowling-alleys">Bowling Alley's</li>
			<li id="clubs">Clubs</li>
		</ul>
	</div>