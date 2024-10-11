import unittest
from ansible.module_utils.facts.virtual.sunos import SunOSVirtual, SunOSVirtualCollector


class TestSunOSVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        virtual_facts = {}
        host_tech = set()
        guest_tech = set()
        zonename = self.module.get_bin_path('zonename')
        if zonename:
            rc, out, err = self.module.run_command(zonename)
            if rc == 0:
                if out.rstrip() == "global":
                    host_tech.add('zone')
                else:
                    guest_tech.add('zone')
                    virtual_facts['container'] = 'zone'
        if os.path.isdir('/.SUNWnative'):
            guest_tech.add('zone')
            virtual_facts['container'] = 'zone'
        if 'container' in virtual_facts and virtual_facts['container'] == 'zone':
            modinfo = self.module.get_bin_path('modinfo')
            if modinfo:
                rc, out, err = self.module.run_command(modinfo)
                if rc == 0:
                    for line in out.splitlines():
                        if 'VMware' in line:
                            guest_tech.add('vmware')
                            virtual_facts['virtualization_type'] = 'vmware'
                            virtual_facts['virtualization_role'] = 'guest'
                        if 'VirtualBox' in line:
                            guest_tech.add('virtualbox')
                            virtual_facts['virtualization_type'] = 'virtualbox'
                            virtual_facts['virtualization_role'] = 'guest'
        if os.path.exists('/proc/vz'):
            guest_tech.add('virtuozzo')
            virtual_facts['virtualization_type'] = 'virtuozzo'
            virtual_facts['virtualization_role'] = 'guest'
        virtinfo = self.module.get_bin_path('virtinfo')
        if virtinfo:
            rc, out, err = self.module.run_command("/usr/sbin/virtinfo -p")
            if rc == 0:
                try:
                    for line in out.splitlines():
                        fields = line.split('|')
                        if fields[0] == 'DOMAINROLE' and fields[1] == 'impl=LDoms':
                            guest_tech.add('ldom')
                            virtual_facts['virtualization_type'] = 'ldom'
                            virtual_facts['virtualization_role'] = 'guest'
                            hostfeatures = []
                            for field in fields[2:]:
                                arg = field.split('=')
                                if arg[1] == 'true':
                                    hostfeatures.append(arg[0])
                            if len(hostfeatures) > 0:
                                virtual_facts['virtualization_role'] = 'host (' + ','.join(hostfeatures) + ')'
                except ValueError:
                    pass
        else:
            smbios = self.module.get_bin_path('smbios')
            if not smbios:
                return
            rc, out, err = self.module.run_command(smbios)
            if rc == 0:
                for line in out.splitlines():
                    if 'VMware' in line:
                        guest_tech.add('vmware')
                        virtual_facts['virtualization_type'] = 'vmware'
                        virtual_facts['virtualization_role'] = 'guest'
                    elif 'Parallels' in line:
                        guest_tech.add('parallels')
                        virtual_facts['virtualization_type'] = 'parallels'
                        virtual_facts['virtualization_role'] = 'guest'
                    elif 'VirtualBox' in line:
                        guest_tech.add('virtualbox')
                        virtual_facts['virtualization_type'] = 'virtualbox'
                        virtual_facts['virtualization_role'] = 'guest'
                    elif 'HVM domU' in line:
                        guest_tech.add('xen')
                        virtual_facts['virtualization_type'] = 'xen'
                        virtual_facts['virtualization_role'] = 'guest'
                    elif 'KVM' in line:
                        guest_tech.add('kvm')
                        virtual_facts['virtualization_type'] = 'kvm'
                        virtual_facts['virtualization_role'] = 'guest'
        virtual_facts['virtualization_tech_guest'] = guest_tech
        virtual_facts['virtualization_tech_host'] = host_tech
        return virtual_facts


if __name__ == '__main__':
    unittest.main()