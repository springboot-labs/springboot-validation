package foo;

import foo.domain.Pessoa;
import foo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class SpringbootValidationApplication implements CommandLineRunner {

    @Autowired
    private PessoaRepository pessoaRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootValidationApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoaRepository.save(pessoa);
    }
}
