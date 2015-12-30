package com.rpc;

public class RPCProxy implements RPC {

	Logging log = new Logging();
	Security sec = new Security();

	RPCTng rpcTng = new RPCTng();

	@Override
	public void doTng() {
		log.doLog();
		sec.doSec();

		rpcTng.doTng();

		log.doLog();
		sec.doSec();
	}

}
