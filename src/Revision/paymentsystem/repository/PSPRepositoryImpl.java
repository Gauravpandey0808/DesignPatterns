package Revision.paymentsystem.repository;

import Revision.paymentsystem.entity.PSPProvider;
import java.util.List;

public class PSPRepositoryImpl implements PSPRepository {
    private final List<PSPProvider> pspProvidersList;

    public PSPRepositoryImpl(List<PSPProvider> pspProvidersList) {
        this.pspProvidersList = pspProvidersList;
    }

    @Override
    public List<PSPProvider> getPSPProviders() {
        return this.pspProvidersList;
    }
}
