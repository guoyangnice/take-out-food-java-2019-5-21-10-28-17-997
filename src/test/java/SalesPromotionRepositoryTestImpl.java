import java.util.List;

public class SalesPromotionRepositoryTestImpl implements SalesPromotionRepository {
    @Override
    public List<SalesPromotion> findAll() {
        return TestData.ALL_SALES_PROMOTIONS;
    }

	@Override
	public int getPromotion1(int price) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPromotion2(String id, int price) {
		// TODO Auto-generated method stub
		return 0;
	}
}
