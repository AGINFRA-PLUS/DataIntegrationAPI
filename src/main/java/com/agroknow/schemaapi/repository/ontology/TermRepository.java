package com.agroknow.schemaapi.repository.ontology;

import com.agroknow.schemaapi.model.domain.VocabularyTerm;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TermRepository extends ElasticsearchRepository<VocabularyTerm, String> {

    List<VocabularyTerm> findAllByLabelStrict(String label, Pageable pageable);

    List<VocabularyTerm> findAllByLabelStrictAndVocabulary(String label, String vocabulary, Pageable pageable);

    Iterable<VocabularyTerm> findAllByMissingMultiLingualLabel();

    Iterable<VocabularyTerm> findAllByVocabulary(String vocabulary);


}
