package gdu.kr.test0515;

public class WriteImpl {
	private ArticleDao dao;
	public WriteImpl(ArticleDao dao) { //생성자
		this.dao = dao;
	}
	public void write() {
		System.out.println("WriteImpo.write 메서드 호출");
		dao.insert();
	}
}
