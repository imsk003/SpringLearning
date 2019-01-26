package sk.spring.Learning;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CDIBusiness {

    @Inject
    CDIDAO cdidao;

    public CDIDAO getCdidao() {
        return cdidao;
    }

    public void setCdidao(CDIDAO cdidao) {
        this.cdidao = cdidao;
    }
}
