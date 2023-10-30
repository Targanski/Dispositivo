package com.n1.atividade.config;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

// Define o pacote em que esta classe está localizada
@Configuration
public class PersistenceConfig {
    // Classe de configuração que define a fonte de dados (DataSource) para acesso ao banco de dados

    @Bean
    public DataSource dataSource() {
        // Método que cria e configura a fonte de dados (DataSource)

        final DriverManagerDataSource dataSource = new DriverManagerDataSource();

        // Configuração da fonte de dados
        dataSource.setDriverClassName("org.sqlite.JDBC"); // Define o driver JDBC a ser utilizado
        dataSource.setUrl("jdbc:sqlite:C:\\db\\data.db"); // Define a URL do banco de dados
        dataSource.setUsername(""); // Define o nome de usuário (vazio no exemplo)
        dataSource.setPassword(""); // Define a senha (vazia no exemplo)

        return dataSource; // Retorna a fonte de dados configurada
    }
}

    // @Bean
    // public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
    //     final LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
    //     em.setDataSource(dataSource());
    //     em.setPackagesToScan(new String[] { "com.apicomsqlite.aula003.controller", "com.apicomsqlite.aula003.enity",
    //             "com.apicomsqlite.aula003.service", "com.apicomsqlite.aula003.repository" });
    //     em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
    //     em.setJpaProperties(additionalProperties());
    //     return em;
    // }

    // final Properties additionalProperties() {
    //     final Properties hibernateProperties = new Properties();
    //     if (env.getProperty("hibernate.hbm2ddl.auto") != null) {
    //         hibernateProperties.setProperty("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
    //     }
    //     if (env.getProperty("hibernate.dialect") != null) {
    //         hibernateProperties.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
    //     }
    //     if (env.getProperty("hibernate.show_sql") != null) {
    //         hibernateProperties.setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
    //     }
    //     return hibernateProperties;
    // }


