package spring5;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("listPrinter")
public class MemberListPrinter {
		private MemberDao memberDao;
		private MemberPrinter printer;
		

		public MemberListPrinter() {
			
		}
		public void printAll() {
			Collection<Member> members = memberDao.selectAll();
			members.forEach(m -> printer.print(m));
		}

		@Autowired
		public void setMemberDao(MemberDao memberDao) {
			this.memberDao = memberDao;
		}
		
		@Autowired
		@Qualifier("printer2")
		public void setMemberPrinter(MemberPrinter printer) {
			this.printer = printer;
		}
}
