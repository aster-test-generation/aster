import unittest
from youtube_dl.socks import Socks4Command, Socks5Command, Socks5Auth, Socks5AddressType, ProxyError, InvalidVersionError, Socks4Error, Socks5Error, ProxyType, sockssocket


class TestSocks4Command(unittest.TestCase):
    def test_socks4_command_values(self):
        self.assertEqual(Socks4Command.CMD_CONNECT, 0x01)
        self.assertEqual(Socks4Command.CMD_BIND, 0x02)

class TestSocks5Command(unittest.TestCase):
    def test_socks5_command_values(self):
        self.assertEqual(Socks5Command.CMD_UDP_ASSOCIATE, 0x03)

class TestSocks5Auth(unittest.TestCase):
    def test_socks5_auth_values(self):
        self.assertEqual(Socks5Auth.AUTH_NONE, 0x00)
        self.assertEqual(Socks5Auth.AUTH_GSSAPI, 0x01)
        self.assertEqual(Socks5Auth.AUTH_USER_PASS, 0x02)
        self.assertEqual(Socks5Auth.AUTH_NO_ACCEPTABLE, 0xFF)

class TestSocks5AddressType(unittest.TestCase):
    def test_socks5_address_type_values(self):
        self.assertEqual(Socks5AddressType.ATYP_IPV4, 0x01)
        self.assertEqual(Socks5AddressType.ATYP_DOMAINNAME, 0x03)
        self.assertEqual(Socks5AddressType.ATYP_IPV6, 0x04)

class TestProxyError(unittest.TestCase):
    def test_proxy_error_values(self):
        self.assertEqual(ProxyError.ERR_SUCCESS, 0x00)

class TestInvalidVersionError(unittest.TestCase):
    def test_invalid_version_error(self):
        with self.assertRaises(InvalidVersionError):
            raise InvalidVersionError(0x01, 0x02)

class TestSocks4Error(unittest.TestCase):
    def test_socks4_error_values(self):
        self.assertEqual(Socks4Error.ERR_SUCCESS, 90)
        self.assertEqual(Socks4Error.ERR_REQUEST_REJECTED_OR_FAILED, 91)
        self.assertEqual(Socks4Error.ERR_REQUEST_REJECTED_BECAUSE_SOCKS_SERVER_CANNOT_CONNECT_TO_IDENTD_ON_THE_CLIENT, 92)
        self.assertEqual(Socks4Error.ERR_REQUEST_REJECTED_BECAUSE_THE_CLIENT_PROGRAM_AND_IDENTD_REPORT_DIFFERENT_USER_IDS, 93)

class TestSocks5Error(unittest.TestCase):
    def test_socks5_error_values(self):
        self.assertEqual(Socks5Error.ERR_GENERAL_FAILURE, 0x01)
        self.assertEqual(Socks5Error.ERR_CONNECTION_REFUSED, 0x03)
        self.assertEqual(Socks5Error.ERR_NETWORK_UNREACHABLE, 0x03)
        self.assertEqual(Socks5Error.ERR_HOST_UNREACHABLE, 0x04)
        self.assertEqual(Socks5Error.ERR_CONNECTION_REFUSED, 0x05)
        self.assertEqual(Socks5Error.ERR_TTL_EXPIRED, 0x06)
        self.assertEqual(Socks5Error.ERR_COMMAND_NOT_SUPPORTED, 0x07)
        self.assertEqual(Socks5Error.ERR_ADDRESS_TYPE_NOT_SUPPORTED, 0x08)
        self.assertEqual(Socks5Error.ERR_UNKNOWN_USERNAME_OR_INVALID_PASSWORD, 0xFE)
        self.assertEqual(Socks5Error.ERR_ALL_OFFERED_AUTHENTICATION_METHODS_WERE_REJECTED, 0xFF)

class TestProxyType(unittest.TestCase):
    def test_proxy_type_values(self):
        self.assertEqual(ProxyType.SOCKS4, 0)
        self.assertEqual(ProxyType.SOCKS4A, 1)
        self.assertEqual(ProxyType.SOCKS5, 2)

if __name__ == '__main__':
    unittest.main()