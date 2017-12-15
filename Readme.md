1:initializr-service默认不启用，需要在在Profiles中勾选full，（或见pom.xml）
2：http://localhost:8080/ -->找到web下的MainController.java--->	
  @RequestMapping(value = "/", produces = "text/html")
	public String home(Map<String, Object> model) {
		renderHome(model);
		return "home";
	}
  --->
  @RequestMapping("/starter.zip")
	@ResponseBody
	public ResponseEntity<byte[]> springZip(BasicProjectRequest basicRequest){
  }
