package com.base.test;

import java.nio.file.Paths;

import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.store.IOContext;
import org.apache.lucene.store.RAMDirectory;
import org.junit.Test;

public class LuceneTest extends BaseTest {

	@Test
	public void testSearch() throws Exception{
		
		String INDEXPATH="E:\\shopping\\lucene_index";
		
		FSDirectory fsDirectory = FSDirectory.open(Paths.get(INDEXPATH));
		RAMDirectory ramDirectory = new RAMDirectory(fsDirectory,IOContext.READONCE);
		
		IndexSearcher indexSearcher = new IndexSearcher(DirectoryReader.open(ramDirectory));
		
		Query query = new TermQuery(new Term("keyword","面膜"));
		
		TopDocs hits = indexSearcher.search(query, 10);
	}
	
}
