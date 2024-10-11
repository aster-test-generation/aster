import unittest
from youtube_dl.socks import *


class TestSocks4Command(unittest.TestCase):
    def test_socks4_command_connect(self):
        self.assertEqual(Socks4Command.CMD_CONNECT, 0x01)

    def test_socks4_command_bind(self):
        self.assertEqual(Socks4Command.CMD_BIND, 0x02)

class TestSocks5Command(unittest.TestCase):
    def test_socks5_command_connect(self):
        self.assertEqual(Socks5Command.CMD_CONNECT, 0x01)

    def test_socks5_command_bind(self):
        self.assertEqual(Socks5Command.CMD_BIND, 0x02)

    def test_socks5_command_udp_associate(self):
        self.assertEqual(Socks5Command.CMD_UDP_ASSOCIATE, 0x03)

class TestSocks5Auth(unittest.TestCase):
    def test_socks5_auth_none(self):
        self.assertEqual(Socks5Auth.AUTH_NONE, 0x00)

    def test_socks5_auth_gssapi(self):
        self.assertEqual(Socks5Auth.AUTH_GSSAPI, 0x01)

    def test_socks5_auth_user_pass(self):
        self.assertEqual(Socks5Auth.AUTH_USER_PASS, 0x02)

    def test_socks5_auth_no_acceptable(self):
        self.assertEqual(Socks5Auth.AUTH_NO_ACCEPTABLE, 0xFF)

class TestSocks5AddressType(unittest.TestCase):
    def test_socks5_address_type_ipv4(self):
        self.assertEqual(Socks5AddressType.ATYP_IPV4, 0x01)

    def test_socks5_address_type_domainname(self):
        self.assertEqual(Socks5AddressType.ATYP_DOMAINNAME, 0x03)

    def test_socks5_address_type_ipv6(self):
        self.assertEqual(Socks5AddressType.ATYP_IPV6, 0x04)

class TestProxyError(unittest.TestCase):
    def test_proxy_error_err_success(self):
        self.assertEqual(ProxyError.ERR_SUCCESS, 0x00)

class TestInvalidVersionError(unittest.TestCase):
    def test_invalid_version_error(self):
        expected_version = 0x01
        got_version = 0x02
        error = InvalidVersionError(expected_version, got_version)
        self.assertEqual(error.args[0], 'Invalid response version from server. Expected {0:02x} got {1:02x}'.format(expected_version, got_version))

class TestSocks4Error(unittest.TestCase):
    def test_socks4_error_err_success(self):
        self.assertEqual(Socks4Error.ERR_SUCCESS, 90)

    def test_socks4_error_codes(self):
        self.assertEqual(Socks4Error.CODES[91], 'request rejected or failed')
        self.assertEqual(Socks4Error.CODES[92], 'request rejected because SOCKS server cannot connect to identd on the client')
        self.assertEqual(Socks4Error.CODES[93], 'request rejected because the client program and identd report different user-ids')

class TestSocks5Error(unittest.TestCase):
    def test_socks5_error_err_general_failure(self):
        self.assertEqual(Socks5Error.ERR_GENERAL_FAILURE, 0x01)

if __name__ == '__main__':
    unittest.main()