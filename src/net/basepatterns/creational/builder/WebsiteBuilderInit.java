package net.basepatterns.creational.builder;

public class WebsiteBuilderInit {

	public static void main(String[] args) {
		//Bad approach
		Website website = new Website();
		website.setName("Visit card");
		website.setCms(Cms.WORDPRESS);
		website.setPrice(500);

		System.out.println(website);
	}
}
