package Revision.paymentsystem.repository;

import Revision.paymentsystem.entity.PSPProvider;

import java.util.List;

public interface PSPRepository {

    List<PSPProvider> getPSPProviders();
}
