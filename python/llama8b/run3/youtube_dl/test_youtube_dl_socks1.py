import unittest
from youtube_dl.socks import Socks4Command, Socks5Command, Socks5Auth, Socks5AddressType, ProxyError, InvalidVersionError, Socks4Error, Socks5Error, ProxyType, sockssocket

class TestSocks4Command(unittest.TestCase):
    def test_CMD_CONNECT(self):
        self.assertEqual(Socks4Command.CMD_CONNECT, 0x01)

    def test_CMD_BIND(self):
        self.assertEqual(Socks4Command.CMD_BIND, 0x02)

class TestSocks5Command(unittest.TestCase):
    def test_CMD_UDP_ASSOCIATE(self):
        self.assertEqual(Socks5Command.CMD_UDP_ASSOCIATE, 0x03)

class TestSocks5Auth(unittest.TestCase):
    def test_AUTH_NONE(self):
        self.assertEqual(Socks5Auth.AUTH_NONE, 0x00)

    def test_AUTH_GSSAPI(self):
        self.assertEqual(Socks5Auth.AUTH_GSSAPI, 0x01)

    def test_AUTH_USER_PASS(self):
        self.assertEqual(Socks5Auth.AUTH_USER_PASS, 0x02)

    def test_AUTH_NO_ACCEPTABLE(self):
        self.assertEqual(Socks5Auth.AUTH_NO_ACCEPTABLE, 0xFF)

class TestSocks5AddressType(unittest.TestCase):
    def test_ATYP_IPV4(self):
        self.assertEqual(Socks5AddressType.ATYP_IPV4, 0x01)

    def test_ATYP_DOMAINNAME(self):
        self.assertEqual(Socks5AddressType.ATYP_DOMAINNAME, 0x03)

    def test_ATYP_IPV6(self):
        self.assertEqual(Socks5AddressType.ATYP_IPV6, 0x04)

class TestProxyError(unittest.TestCase):
    def test_ERR_SUCCESS(self):
        self.assertEqual(ProxyError.ERR_SUCCESS, 0x00)

class TestInvalidVersionError(unittest.TestCase):
    def test_invalid_version(self):
        error = InvalidVersionError(1, 2)
        self.assertEqual(error.code, 0)
        self.assertEqual(error.msg, 'Invalid response version from server. Expected 01 got 02')

class TestSocks4Error(unittest.TestCase):
    def test_ERR_SUCCESS(self):
        self.assertEqual(Socks4Error.ERR_SUCCESS, 90)

    def test_request_rejected_or_failed(self):
        error = Socks4Error(91, 'request rejected or failed')
        self.assertEqual(error.code, 91)
        self.assertEqual(error.msg, 'request rejected or failed')

class TestSocks5Error(unittest.TestCase):
    def test_ERR_GENERAL_FAILURE(self):
        self.assertEqual(Socks5Error.ERR_GENERAL_FAILURE, 0x01)

    def test_connection_not_allowed_by_ruleset(self):
        error = Socks5Error(0x02, 'connection not allowed by ruleset')
        self.assertEqual(error.code, 0x02)
        self.assertEqual(error.msg, 'connection not allowed by ruleset')

class TestProxyType(unittest.TestCase):
    def test_PROXY_TYPE(self):
        self.assertEqual(ProxyType.SOCKS4, 0)
        self.assertEqual(ProxyType.SOCKS4A, 1)
        self.assertEqual(ProxyType.SOCKS5, 2)

class TestSocksSocket(unittest.TestCase):
    def test_setproxy(self):
        socks = sockssocket()
        socks.setproxy(ProxyType.SOCKS4, 'localhost', 8080)
        self.assertEqual(socks._proxy.type, ProxyType.SOCKS4)
        self.assertEqual(socks._proxy.host, 'localhost')
        self.assertEqual(socks._proxy.port, 8080)

    def test_recvall(self):
        socks = sockssocket()
        data = b'1234567890'
        socks.sendall(data)
        result = socks.recvall(len(data))
        self.assertEqual(result, data)

    def test_recv_bytes(self):
        socks = sockssocket()
        data = b'1234567890'
        socks.sendall(data)
        result = socks._recv_bytes(len(data))
        self.assertEqual(result, data)

    def test_len_and_data(self):
        data = b'1234567890'
        result = sockssocket._len_and_data(data)
        self.assertEqual(result, compat_struct_pack('!B', len(data)) + data)

    def test_check_response_version(self):
        socks = sockssocket()
        socks._check_response_version(1, 2)
        self.fail('Expected InvalidVersionError')

    def test_resolve_address(self):
        socks = sockssocket()
        result = socks._resolve_address('localhost', None, True)
        self.assertEqual(result, socket.inet_aton('127.0.0.1'))

    def test_setup_socks4(self):
        socks = sockssocket()
        address = ('localhost', 8080)
        result = socks._setup_socks4(address)
        self.assertEqual(result, ('localhost', 8080))

if __name__ == '__main__':
    unittest.main()