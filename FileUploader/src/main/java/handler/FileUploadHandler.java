package handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.*;

import java.util.logging.FileHandler;

public class FileUploadHandler extends SimpleChannelInboundHandler<HttpObject> {

    private HttpHeaders headers;
    private HttpRequest request;
    private FullHttpRequest fullRequest;

    protected void channelRead0(ChannelHandlerContext ctx, HttpObject msg) throws Exception {
        if (msg instanceof HttpRequest){
            request = (HttpRequest)msg;
            headers = request.headers();

            HttpMethod method = request.method();
            if(method.equals(HttpMethod.GET)){

            }else if (method.equals(HttpMethod.POST)){

            }
        }
    }
}
