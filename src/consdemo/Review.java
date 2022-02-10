package consdemo;

public class Review {
	
	private int reviewId; 
	private String reviewGivenBy; 
	private int rating; 
	
	public Review() { 
		reviewId= -1 ;
		reviewGivenBy = "Not Available"; 
		rating =-1; 
	}
	public Review(int reviewId, String reviewGivenby, int rating) {
		this.reviewId = reviewId;
		this.reviewGivenBy = reviewGivenBy; 
		this.rating = rating;
	}
	public Review ( int reviewId, String reviewGivenBy) {
		this(); 
		this.reviewId = reviewId; 
		this.reviewGivenBy = reviewGivenBy;
	}
	public int getReviewId() {
		return reviewId;
		
	}
	public void setReviewId( int reviewId) {
		this.reviewId  = reviewId;
		
	}
	public String getReviewGivenBy() {
		return reviewGivenBy;
	}
	
	public void setReviewGivenBy(String reviewGivenBy ) {
		
	}
	
	
}
