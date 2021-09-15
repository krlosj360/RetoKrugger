package com.reto.kruger.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.reto.kruger.entity.Usuarios;


@Repository
public interface RetoRepository extends JpaRepository<Usuarios, String> {
	
	 @Query(nativeQuery = true,value = "select * from usuarios where estadovacuna =?1 and tipovacuna = ?2 and fechavacuna = ?3")
	 public List<Usuarios> queryFiltro(String estadoVacuna,String tipovacuna,String fechavacuna  );
	


}