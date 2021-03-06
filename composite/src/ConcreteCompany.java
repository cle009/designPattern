import java.util.ArrayList;
import java.util.List;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/1 16:41
 */
public class ConcreteCompany extends Company {

	private List<Company> children = new ArrayList<Company>();

	public ConcreteCompany(String name) {
		super(name);
	}

	@Override
	public void add(Company c) {
		children.add(c);
	}

	@Override
	public void remove(Company c) {
		children.remove(c);
	}

	@Override
	public void display(int depth) {

		for (int i = 0; i < depth; i++) {
			System.out.print("-");
		}
		System.out.println(name);

		for (Company child : children) {
			child.display(depth + 2);
		}
	}

	@Override
	public void lineOfDuty() {

		for (Company child : children) {
			child.lineOfDuty();
		}
	}
}
