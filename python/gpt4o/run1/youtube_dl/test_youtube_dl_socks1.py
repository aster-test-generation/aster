import unittest
from youtube_dl.socks import *

class TestSocks4Command(unittest.TestCase):
    def test_cmd_connect(self):
        self.assertEqual(Socks4Command.CMD_CONNECT, 0x01)

    def test_cmd_bind(self):
        self.assertEqual(Socks4Command.CMD_BIND, 0x02)

class TestSocks5Command(unittest.TestCase):
    def test_cmd_udp_associate(self):
        self.assertEqual(Socks5Command.CMD_UDP_ASSOCIATE, 0x03)

class TestSocks5Auth(unittest.TestCase):
    def test_auth_none(self):
        self.assertEqual(Socks5Auth.AUTH_NONE, 0x00)

    def test_auth_gssapi(self):
        self.assertEqual(Socks5Auth.AUTH_GSSAPI, 0x01)

    def test_auth_user_pass(self):
        self.assertEqual(Socks5Auth.AUTH_USER_PASS, 0x02)

    def test_auth_no_acceptable(self):
        self.assertEqual(Socks5Auth.AUTH_NO_ACCEPTABLE, 0xFF)

class TestSocks5AddressType(unittest.TestCase):
    def test_atyp_ipv4(self):
        self.assertEqual(Socks5AddressType.ATYP_IPV4, 0x01)

    def test_atyp_domainname(self):
        self.assertEqual(Socks5AddressType.ATYP_DOMAINNAME, 0x03)

    def test_atyp_ipv6(self):
        self.assertEqual(Socks5AddressType.ATYP_IPV6, 0x04)

class TestProxyError(unittest.TestCase):
    def test_init_with_code(self):
        error = ProxyError(0x01)
        self.assertEqual(error.args[0], 0x01)

    def test_init_with_code_and_msg(self):
        error = ProxyError(0x01, "Test message")
        self.assertEqual(error.args[1], "Test message")

class TestInvalidVersionError(unittest.TestCase):
    def test_init(self):
        error = InvalidVersionError(0x04, 0x05)
        self.assertIn("Invalid response version from server", error.args[1])

class TestSocks4Error(unittest.TestCase):
    def test_init(self):
        error = Socks4Error(91)
        self.assertEqual(error.args[1], 'request rejected or failed')

class TestSocks5Error(unittest.TestCase):
    def test_init(self):
        error = Socks5Error(0x01)
        self.assertEqual(error.args[1], 'general SOCKS server failure')

class TestProxyType(unittest.TestCase):
    def test_socks4(self):
        self.assertEqual(ProxyType.SOCKS4, 0)

    def test_socks4a(self):
        self.assertEqual(ProxyType.SOCKS4A, 1)

    def test_socks5(self):
        self.assertEqual(ProxyType.SOCKS5, 2)

class TestSockssocket(unittest.TestCase):
    def setUp(self):
        self.sock = sockssocket()

    def test_init(self):
        self.assertIsNone(self.sock._proxy)

    def test_setproxy(self):
        self.sock.setproxy(ProxyType.SOCKS5, 'localhost', 1080)
        self.assertEqual(self.sock._proxy.type, ProxyType.SOCKS5)

    def test_recvall(self):
        self.sock.recv = lambda x: b'\x00' * x
        result = self.sock.recvall(4)
        self.assertEqual(result, b'\x00\x00\x00\x00')

    def test_recvall_eof(self):
        self.sock.recv = lambda x: b''
        with self.assertRaises(EOFError):
            self.sock.recvall(4)

    def test_recv_bytes(self):
        self.sock.recvall = lambda x: b'\x01\x02'
        result = self.sock._recv_bytes(2)
        self.assertEqual(result, (1, 2))

    def test_len_and_data(self):
        result = self.sock._len_and_data(b'\x01\x02')
        self.assertEqual(result, b'\x02\x01\x02')

    def test_check_response_version(self):
        with self.assertRaises(InvalidVersionError):
            self.sock._check_response_version(0x04, 0x05)

    def test_resolve_address(self):
        result = self.sock._resolve_address('127.0.0.1', None, False)
        self.assertEqual(result, socket.inet_aton('127.0.0.1'))

    def test_resolve_address_remote_dns(self):
        self.sock._proxy = Proxy(ProxyType.SOCKS5, 'localhost', 1080, None, None, True)
        result = self.sock._resolve_address('nonexistent.domain', SOCKS4_DEFAULT_DSTIP, True)
        self.assertEqual(result, SOCKS4_DEFAULT_DSTIP)

    def test_setup_socks4(self):
        self.sock._proxy = Proxy(ProxyType.SOCKS4, 'localhost', 1080, None, None, False)
        self.sock.sendall = lambda x: None
        self.sock.recvall = lambda x: compat_struct_pack('!BBHI', SOCKS4_REPLY_VERSION, Socks4Error.ERR_SUCCESS, 0, 0)
        result = self.sock._setup_socks4(('127.0.0.1', 80))
        self.assertEqual(result, (0, 0))

    def test_setup_socks4_error(self):
        self.sock._proxy = Proxy(ProxyType.SOCKS4, 'localhost', 1080, None, None, False)
        self.sock.sendall = lambda x: None
        self.sock.recvall = lambda x: compat_struct_pack('!BBHI', SOCKS4_REPLY_VERSION, 91, 0, 0)
        with self.assertRaises(Socks4Error):
            self.sock._setup_socks4(('127.0.0.1', 80))

    def test_setup_socks4a(self):
        self.sock._proxy = Proxy(ProxyType.SOCKS4A, 'localhost', 1080, None, None, True)
        self.sock.sendall = lambda x: None
        self.sock.recvall = lambda x: compat_struct_pack('!BBHI', SOCKS4_REPLY_VERSION, Socks4Error.ERR_SUCCESS, 0, 0)
        self.sock._setup_socks4a(('127.0.0.1', 80))

    def test_socks5_auth(self):
        self.sock._proxy = Proxy(ProxyType.SOCKS5, 'localhost', 1080, 'user', 'pass', True)
        self.sock.sendall = lambda x: None
        self.sock._recv_bytes = lambda x: (SOCKS5_VERSION, Socks5Auth.AUTH_USER_PASS)
        self.sock._check_response_version = lambda x, y: None
        self.sock._socks5_auth()

    def test_socks5_auth_no_acceptable(self):
        self.sock._proxy = Proxy(ProxyType.SOCKS5, 'localhost', 1080, None, None, True)
        self.sock.sendall = lambda x: None
        self.sock._recv_bytes = lambda x: (SOCKS5_VERSION, Socks5Auth.AUTH_NO_ACCEPTABLE)
        with self.assertRaises(Socks5Error):
            self.sock._socks5_auth()

    def test_setup_socks5(self):
        self.sock._proxy = Proxy(ProxyType.SOCKS5, 'localhost', 1080, 'user', 'pass', True)
        self.sock.sendall = lambda x: None
        self.sock._recv_bytes = lambda x: (SOCKS5_VERSION, Socks5Error.ERR_SUCCESS, 0, Socks5AddressType.ATYP_IPV4)
        self.sock.recvall = lambda x: b'\x00' * x
        result = self.sock._setup_socks5(('127.0.0.1', 80))
        self.assertEqual(result, (b'\x00\x00\x00\x00', 0))

    def test_make_proxy(self):
        self.sock._proxy = Proxy(ProxyType.SOCKS5, 'localhost', 1080, 'user', 'pass', True)
        self.sock._setup_socks5 = lambda x: None
        result = self.sock._make_proxy(lambda s, a: 0, ('127.0.0.1', 80))
        self.assertEqual(result, 0)

    def test_connect(self):
        self.sock._proxy = Proxy(ProxyType.SOCKS5, 'localhost', 1080, 'user', 'pass', True)
        self.sock._make_proxy = lambda f, a: None
        self.sock.connect(('127.0.0.1', 80))

    def test_connect_ex(self):
        self.sock._proxy = Proxy(ProxyType.SOCKS5, 'localhost', 1080, 'user', 'pass', True)
        self.sock._make_proxy = lambda f, a: 0
        result = self.sock.connect_ex(('127.0.0.1', 80))
        self.assertEqual(result, 0)

if __name__ == '__main__':
    unittest.main()