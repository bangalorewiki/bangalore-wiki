<script type="text/javascript">
	$(document).ready(function(){
		$("#search-submit").submit(function(){
			var searchStr = $("#search").val();
			var params = {lucky: searchStr};
			$("#content-section").load("bwiki/search-all", params);
			return false;
		});
	});
</script>

<div id="header1" >
	<div class="head">
		<div class="copyrightcss whitetext">About Us | Settings | Feedback</div>
		<div class="bwiki-logo">BangaloreWiki</div>
		<div class="bwiki-search">
		<form id="search-submit">
			<input id="search" type="text" class="bwiki-input-search"/>
		</form>
		</div>
	</div>
</div>