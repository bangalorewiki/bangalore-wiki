<script type="text/javascript">
	$(document).ready(function(){
		$("#search-submit").click(function(){
			var searchStr = $("#search").val();
			var params = {lucky: searchStr};
			$("#content-section").load("bwiki/search-all", params);
		});
	});
</script>

<div id="header1">
	<div class="head">
		<div class="copyrightcss whitetext">About Us | Settings | Feedback</div>
		<div class="bwiki-logo">BangaloreWiki</div>
		<div class="bwiki-search">
			<input id="search" type="text" class="bwiki-input-search"/>
			<input id="search-submit" type="button" class="bwiki-search-submit"/>
		</div>
	</div>
</div>