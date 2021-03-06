package com.kondasamy.soapui.requestfilter;

import com.eviware.soapui.impl.support.AbstractHttpRequestInterface;
import com.eviware.soapui.impl.wsdl.submit.filters.AbstractRequestFilter;
import com.eviware.soapui.impl.wsdl.submit.transports.http.BaseHttpRequestTransport;
import com.eviware.soapui.impl.wsdl.submit.transports.http.HttpResponse;
import com.eviware.soapui.model.iface.SubmitContext;
import com.eviware.soapui.plugins.auto.PluginRequestFilter;
import org.apache.http.HttpRequest;

//@com.eviware.soapui.plugins.auto.PluginRequestFilter(protocol = "http")
@PluginRequestFilter(protocol = "http")
public class PluginRequestFilter extends AbstractRequestFilter
{
    @Override
    public void afterAbstractHttpResponse(SubmitContext context, AbstractHttpRequestInterface<?> request)
    {
        HttpResponse response = (HttpResponse) context.getProperty(BaseHttpRequestTransport.RESPONSE);
//        requestData = request.afterRequestInjection.
        response.setProperty("Secret Message", "bu!");
    }
}
