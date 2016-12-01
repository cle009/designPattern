/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/1 16:37
 */
public abstract class Company {

	protected String name;

	public Company(String name) {
		this.name = name;
	}

	/**
	 * 增加
	 * @param c
	 */
	public abstract void add(Company c);

	/**
	 * 移除
	 * @param c
	 */
	public abstract void remove(Company c);

	/**
	 * 显示
	 * @param depth
	 */
	public abstract void display(int depth);

	/**
	 * 履行职责
	 */
	public abstract void lineOfDuty();
}
