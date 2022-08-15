package churchMembers;

public class Member {

	private short memberId;
	private String name ;
	private byte HarvestTokenReturnedCount;
	private byte HarvestTokenBoughtCount;
	private boolean HarvestTokenBoughtFlag;
	private boolean HarvestTokenReturnedFlag;
	
	
	public Member(short memberId, byte harvestTokenBoughtCount) {
		super();
		this.memberId = memberId;
		HarvestTokenBoughtCount = harvestTokenBoughtCount;
	}
	public short getMemberId() {
		return memberId;
	}
	public void setMemberId(short memberId) {
		this.memberId = memberId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte getHarvestTokenReturnedCount() {
		return HarvestTokenReturnedCount;
	}
	public void setHarvestTokenReturnedCount(byte harvestTokenReturnedCount) {
		HarvestTokenReturnedCount = harvestTokenReturnedCount;
	}
	public byte getHarvestTokenBoughtCount() {
		return HarvestTokenBoughtCount;
	}
	public void setHarvestTokenBoughtCount(byte harvestTokenBoughtCount) {
		HarvestTokenBoughtCount = harvestTokenBoughtCount;
	}
	public boolean isHarvestTokenBoughtFlag() {
		return HarvestTokenBoughtFlag;
	}
	public void setHarvestTokenBoughtFlag(boolean harvestTokenBoughtFlag) {
		HarvestTokenBoughtFlag = harvestTokenBoughtFlag;
	}
	public boolean isHarvestTokenReturnedFlag() {
		return HarvestTokenReturnedFlag;
	}
	public void setHarvestTokenReturnedFlag(boolean harvestTokenReturnedFlag) {
		HarvestTokenReturnedFlag = harvestTokenReturnedFlag;
	}
	
	
}
