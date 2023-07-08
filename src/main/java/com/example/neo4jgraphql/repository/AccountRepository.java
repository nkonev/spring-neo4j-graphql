package com.example.neo4jgraphql.repository;

import com.example.neo4jgraphql.model.Account;
import org.springframework.data.domain.ScrollPosition;
import org.springframework.data.domain.Sort;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.graphql.data.GraphQlRepository;
import org.springframework.graphql.data.query.QueryByExampleDataFetcher;
import org.springframework.graphql.data.query.ScrollSubrange;

@GraphQlRepository
public interface AccountRepository extends
        Neo4jRepository<Account, String>,
        QueryByExampleDataFetcher.QueryByExampleBuilderCustomizer<Account> {
    @Override
    default QueryByExampleDataFetcher.Builder<Account, ?> customize(QueryByExampleDataFetcher.Builder<Account, ?> builder) {
        return builder.sortBy(Sort.by("username"))
                .defaultScrollSubrange(new ScrollSubrange(ScrollPosition.offset(), 1, true));
    }
}
