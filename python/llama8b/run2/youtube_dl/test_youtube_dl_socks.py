import unittest
from youtube_dl.socks import Socks4Command, Socks5Command, Socks5Auth, Socks5AddressType, ProxyError, InvalidVersionError, Socks4Error, Socks5Error, ProxyType, sockssocket


class TestSocks4Command(unittest.TestCase):
    def test_socks4_command(self):
        self.assertEqual(Socks4Command.CMD_CONNECT, 0x01)
        self.assertEqual(Socks4Command.CMD_BIND, 0x02)

class TestSocks5Command(unittest.TestCase):
    def test_socks5_command(self):
        self.assertEqual(Socks5Command.CMD_UDP_ASSOCIATE, 0x03)

class TestSocks5Auth(unittest.TestCase):
    def test_socks5_auth(self):
        self.assertEqual(Socks5Auth.AUTH_NONE, 0x00)
        self.assertEqual(Socks5Auth.AUTH_GSSAPI, 0x01)
        self.assertEqual(Socks5Auth.AUTH_USER_PASS, 0x02)
        self.assertEqual(Socks5Auth.AUTH_NO_ACCEPTABLE, 0xFF)

class TestSocks5AddressType(unittest.TestCase):
    def test_socks5_address_type(self):
        self.assertEqual(Socks5AddressType.ATYP_IPV4, 0x01)
        self.assertEqual(Socks5AddressType.ATYP_DOMAINNAME, 0x03)
        self.assertEqual(Socks5AddressType.ATYP_IPV6, 0x04)

class TestProxyError(unittest.TestCase):
    def test_proxy_error(self):
        error = ProxyError('unknown error')
        self.assertEqual(error.code, None)
        self.assertEqual(error.msg, 'unknown error')

class TestInvalidVersionError(unittest.TestCase):
    def test_invalid_version_error(self):
        error = InvalidVersionError(0x01, 0x02)
        self.assertEqual(error.expected_version, 0x01)
        self.assertEqual(error.got_version, 0x02)

class TestSocks4Error(unittest.TestCase):
    def test_socks4_error(self):
        error = Socks4Error(91, 'request rejected or failed')
        self.assertEqual(error.code, 91)
        self.assertEqual(error.msg, 'request rejected or failed')

class TestSocks5Error(unittest.TestCase):
    def test_socks5_error(self):
        error = Socks5Error(0x01, 'general SOCKS server failure')
        self.assertEqual(error.code, 0x01)
        self.assertEqual(error.msg, 'general SOCKS server failure')

class TestProxyType(unittest.TestCase):
    def test_proxy_type(self):
        self.assertEqual(ProxyType.SOCKS4, 0)
        self.assertEqual(ProxyType.SOCKS4A, 1)
        self.assertEqual(ProxyType.SOCKS5, 2)

class TestSocksSocket(unittest.TestCase):
    def test_init(self):
        sock = sockssocket()
        self.assertIsNone(sock._proxy)

    def test_setproxy(self):
        sock = sockssocket()
        sock.setproxy(ProxyType.SOCKS4, 'example.com', 8080)
        self.assertEqual(sock._proxy.type, ProxyType.SOCKS4)
        self.assertEqual(sock._proxy.host, 'example.com')
        self.assertEqual(sock._proxy.port, 8080)

    def test_recvall(self):
        sock = sockssocket()
        data = b'hello'
        sock.recvall = lambda cnt: data
        result = sock.recvall(len(data))
        self.assertEqual(result, data)

    def test_recv_bytes(self):
        sock = sockssocket()
        data = b'hello'
        sock.recv = lambda cnt: data[:cnt]
        result = sock._recv_bytes(len(data))
        self.assertEqual(result, data)

    def test_len_and_data(self):
        sock = sockssocket()
        data = b'hello'
        result = sock._len_and_data(data)
        self.assertEqual(result, compat_struct_pack('!B', len(data)) + data)

    def test_check_response_version(self):
        sock = sockssocket()
        sock._check_response_version(0x01, 0x02)
        self.assertRaises(InvalidVersionError)

    def test_resolve_address(self):
        sock = sockssocket()
        destaddr = 'example.com'
        result = sock._resolve_address(destaddr, None, use_remote_dns=True)
        self.assertEqual(result, socket.inet_aton(socket.gethostbyname(destaddr)))

    def test_setup_socks4(self):
        sock = sockssocket()
        destaddr = ('example.com', 8080)
        result = sock._setup_socks4(destaddr)
        self.assertEqual(result, ('example.com', 8080))

if __name__ == '__main__':
    unittest.main()